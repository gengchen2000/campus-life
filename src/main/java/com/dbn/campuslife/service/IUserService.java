package com.dbn.campuslife.service;

import com.dbn.campuslife.entity.user.RegisterUserDTO;

public interface IUserService {

    /**
     * 用户注册
     *
     * @param registerUserDTO 注册信息
     */
    void registerUserInfo(RegisterUserDTO registerUserDTO);
}
