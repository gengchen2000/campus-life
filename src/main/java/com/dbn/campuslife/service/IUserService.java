package com.dbn.campuslife.service;

import com.dbn.campuslife.entity.user.*;
import com.dbn.campuslife.util.Result;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface IUserService {

    /**
     * 用户注册
     *
     * @param registerUserDTO 注册信息
     */
    void registerUserInfo(RegisterUserDTO registerUserDTO);

    /**
     * 用户登录
     *
     * @param userDTO 登录信息
     * @param request request请求
     */
    void loginUser(LoginUserDTO userDTO, HttpServletRequest request);

    /**
     * 更新用户信息
     *
     * @param request       request请求
     * @param updateUserDTO 用户信息
     */
    void updateUserInfo(UpdateUserDTO updateUserDTO, HttpServletRequest request);

    /**
     * 查询所有的用户
     *
     * @param listUserDTO 用户ID
     * @param userInfo    当前登录人信息
     * @return 返回所有的用户
     */
    Result<UserInfoPO> listAllUsers(ListUserDTO listUserDTO, UserInfoPO userInfo);

    /**
     * 新增关注
     *
     * @param attentionUserDTO 新增关注人ID
     * @param userInfo         当前登录人信息
     */
    void addAttentionUser(AttentionUserDTO attentionUserDTO, UserInfoPO userInfo);

    /**
     * 取消关注
     *
     * @param attentionUserDTO 取消关注人ID
     * @param userInfo         当前登录人信息
     */
    void deleteAttentionUser(AttentionUserDTO attentionUserDTO, UserInfoPO userInfo);

    UserInfoPO getTargetUser(TargetUserDTO targetUserDTO);
}
