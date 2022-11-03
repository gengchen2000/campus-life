package com.dbn.campuslife.service.impl;

import com.dbn.campuslife.entity.user.LoginUserDTO;
import com.dbn.campuslife.entity.user.RegisterUserDTO;
import com.dbn.campuslife.entity.user.UserInfoPO;
import com.dbn.campuslife.exception.BusinessException;
import com.dbn.campuslife.mapper.UserMapper;
import com.dbn.campuslife.service.IUserService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.springframework.util.DigestUtils;

import java.util.Objects;
import java.util.UUID;

/**
 * 用户信息的服务对象
 */
@Service
public class UserServiceImpl implements IUserService {

    /**
     * 日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    /**
     * 用户持久化对象
     */
    @Resource
    UserMapper userMapper;

    @Override
    public void registerUserInfo(RegisterUserDTO registerUserDTO) {
        /*用户名是否存在*/
        Integer i = userMapper.existUsername(registerUserDTO.getUsername());
        if (i > 0) {
            throw new BusinessException("用户名已存在");
        }
        /*随机生成*/
        String salt = UUID.randomUUID().toString();
        /*获取加密后的密码*/
        String password = getPassword(registerUserDTO.getPassword(), salt);
        /*放入密码和盐值*/
        registerUserDTO.setPassword(password);
        registerUserDTO.setSalt(salt);
        userMapper.addUserInfo(registerUserDTO);
    }

    @Override
    public void loginUser(LoginUserDTO userDTO, HttpServletRequest request) {
//        判断用户名是否存在唯一的值
        Integer i = userMapper.existUsername(userDTO.getUsername());
        if (i == 0) {
            throw new BusinessException("用户名不存在");
        } else if (i > 1) {
            throw new BusinessException("用户名数量存在问题,请联系管理员");
        }
//        获取当前用户的所有信息
        UserInfoPO userInfo = userMapper.getUserInfoByUserName(userDTO.getUsername());
//        获取用户当前输入密码的加密密码
        String password = getPassword(userDTO.getPassword(), userInfo.getSalt());
//        判断用户的密码与输入的加密密码是否相同
        if (!Objects.equals(password, userInfo.getPassword())) {
            throw new BusinessException("密码错误");
        }
        request.getSession().setAttribute("userInfo", userInfo);
    }

    /**
     * 密码加密
     *
     * @param password 原始密码
     * @param salt     盐值
     * @return 加密后的密码
     */
    private String getPassword(String password, String salt) {
        for (int i = 0; i < 3; i++) {
            password = DigestUtils.md5DigestAsHex((salt + password + salt).getBytes());
        }
        return password;
    }

}
