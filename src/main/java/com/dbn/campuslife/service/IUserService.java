package com.dbn.campuslife.service;

import com.dbn.campuslife.entity.user.LoginUserDTO;
import com.dbn.campuslife.entity.user.RegisterUserDTO;
import com.dbn.campuslife.entity.user.UpdateUserDTO;

import javax.servlet.http.HttpServletRequest;

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
}
