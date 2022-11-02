package com.dbn.campuslife.service.impl;

import com.dbn.campuslife.entity.user.RegisterUserDTO;
import com.dbn.campuslife.exception.BusinessException;
import com.dbn.campuslife.mapper.UserMapper;
import com.dbn.campuslife.service.IUserService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;

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
        boolean flag = userMapper.existUsername(registerUserDTO.getUsername());
        if (flag) {
            throw new BusinessException("用户名已存在");
        }
        userMapper.addUserInfo(registerUserDTO);
    }

}
