package com.dbn.campuslife.controller;


import com.dbn.campuslife.entity.user.*;
import com.dbn.campuslife.service.IUserService;
import com.dbn.campuslife.util.JsonResult;
import com.dbn.campuslife.util.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 用户控制层
 */
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

    /**
     * 登录
     *
     * @param userDTO 用户登录信息
     * @param request request请求
     * @return 成功或失败
     */
    @RequestMapping("/login")
    public JsonResult<Void> login(@RequestBody LoginUserDTO userDTO, HttpServletRequest request) {
        try {
            iUserService.loginUser(userDTO, request);
            return JsonResult.success();
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "用户登录", e);
        }
    }

    /**
     * 获取登录人信息
     *
     * @param request request请求
     */
    @RequestMapping("/getUserInfo")
    public JsonResult<UserInfoPO> getUserInfo(HttpServletRequest request) {
        try {
            UserInfoPO userInfo = (UserInfoPO) (request.getSession().getAttribute("userInfo"));
            return JsonResult.success(userInfo);
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "获取登录人信息", e);
        }
    }

    /**
     * 获取目标人信息
     */
    @RequestMapping("/getTargetUserInfo")
    public JsonResult<UserInfoPO> getTargetUserInfo(@RequestBody TargetUserDTO targetUserInfo) {
        try {
            return JsonResult.success(iUserService.getTargetUser(targetUserInfo));
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "获取登录人信息", e);
        }
    }

    /**
     * 更新用户信息
     *
     * @param updateUserDTO 用户信息
     * @param request       request请求
     * @return 修改成功或失败
     */
    @RequestMapping("/updateUserInfo")
    public JsonResult<Void> updateUserInfo(@RequestBody UpdateUserDTO updateUserDTO, HttpServletRequest request) {
        try {
            iUserService.updateUserInfo(updateUserDTO, request);
            return JsonResult.success();
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "更新用户信息", e);
        }
    }

    /**
     * 新增关注用户
     *
     * @param listUserDTO 当前登录人ID
     * @param request     request请求用于获取登录人
     * @return 关注成功或失败
     */
    @RequestMapping("/addAttentionUser")
    public JsonResult<Result<UserInfoPO>> addAttentionUser(@RequestBody AttentionUserDTO attentionUserDTO, HttpServletRequest request) {
        try {
            UserInfoPO userInfo = (UserInfoPO) request.getSession().getAttribute("userInfo");
            iUserService.addAttentionUser(attentionUserDTO, userInfo);
            return JsonResult.success();
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "新增关注用户", e);
        }
    }

    /**
     * 取消关注
     *
     * @param listUserDTO 取消关注人ID
     * @param request     request请求用于获取登录人
     * @return 取消关注成功或失败
     */
    @RequestMapping("/deleteAttentionUser")
    public JsonResult<Result<UserInfoPO>> deleteAttentionUser(@RequestBody AttentionUserDTO attentionUserDTO, HttpServletRequest request) {
        try {
            UserInfoPO userInfo = (UserInfoPO) request.getSession().getAttribute("userInfo");
            iUserService.deleteAttentionUser(attentionUserDTO, userInfo);
            return JsonResult.success();
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "取消关注", e);
        }
    }

    /**
     * 查找所有用户
     *
     * @param listUserDTO 当前登录人ID
     * @param request     request请求用户获取登录人
     * @return 当前登录人对用户的关注信息
     */
    @RequestMapping("/listAllUsers")
    public JsonResult<Result<UserInfoPO>> listAllUsers(@RequestBody ListUserDTO listUserDTO, HttpServletRequest request) {
        try {
            UserInfoPO userInfo = (UserInfoPO) request.getSession().getAttribute("userInfo");
            return JsonResult.success(iUserService.listAllUsers(listUserDTO, userInfo));
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "查找用户", e);
        }
    }

    /**
     * 注销
     *
     * @param request request请求
     * @return 注销成功或失败
     */
    @RequestMapping("/removeUserInfo")
    public JsonResult<Void> removeUserInfo(HttpServletRequest request) {
        try {
            request.getSession().removeAttribute("userInfo");
            return JsonResult.success();
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "注销", e);
        }
    }
}
