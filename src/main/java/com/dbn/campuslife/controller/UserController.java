package com.dbn.campuslife.controller;


import com.dbn.campuslife.entity.user.RegisterUserDTO;
import com.dbn.campuslife.exception.CustomException;
import com.dbn.campuslife.service.IUserService;
import com.dbn.campuslife.util.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 日志对象
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Resource
    IUserService iUserService;


    /**
     * 注册账号
     *
     * @param registerUserDTO 用户注册信息
     * @return 注册成功或失败
     */
    @RequestMapping("/register")
    public JsonResult<Void> register(@RequestBody RegisterUserDTO registerUserDTO, HttpServletRequest request) {
        try {
            iUserService.registerUserInfo(registerUserDTO);
            return JsonResult.success();
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "用户注册:", e);
        }
    }

}
