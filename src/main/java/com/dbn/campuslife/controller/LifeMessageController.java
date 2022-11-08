package com.dbn.campuslife.controller;

import com.dbn.campuslife.entity.message.*;
import com.dbn.campuslife.entity.user.UserInfoPO;
import com.dbn.campuslife.service.ILifeMessageService;
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
 * 消息控制层
 */
@RestController
@RequestMapping("/lifeMessage")
public class LifeMessageController {

    private static final Logger LOGGER = LoggerFactory.getLogger(LifeMessageController.class);

    @Resource
    ILifeMessageService iLifeMessageService;

    @RequestMapping("/addLifeMessage")
    public JsonResult<Void> addLifeMessage(@RequestBody AddMessageDTO addMessageDTO, HttpServletRequest request) {
        try {
            /*获取当前登录人信息*/
            UserInfoPO userInfo = (UserInfoPO) request.getSession().getAttribute("userInfo");
            iLifeMessageService.addLifeMessage(addMessageDTO, userInfo.getId());
            return JsonResult.success();
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "新增消息", e);
        }
    }

    /**
     * 公开信息查询
     *
     * @param lifeMessageDTO 查询条件
     * @return 公开分享的信息
     */
    @RequestMapping("/listLifeMessage")
    public JsonResult<Result<LifeMessagePO>> listLifeMessage(@RequestBody LifeMessageDTO lifeMessageDTO, HttpServletRequest request) {
        try {
            UserInfoPO userInfo = (UserInfoPO) request.getSession().getAttribute("userInfo");
            return JsonResult.success(iLifeMessageService.listLifeMessage(lifeMessageDTO, userInfo));
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "公开信息查询", e);
        }
    }

    /**
     * 删除消息
     *
     * @param lifeMessageDTO 删除消息ID
     * @param request        request请求
     * @return 成功或失败
     */
    @RequestMapping("/deleteLifeMessage")
    public JsonResult<Void> deleteLifeMessage(@RequestBody LifeMessageDTO lifeMessageDTO, HttpServletRequest request) {
        try {
            UserInfoPO userInfo = (UserInfoPO) request.getSession().getAttribute("userInfo");
            iLifeMessageService.deleteLifeMessageById(lifeMessageDTO, userInfo);
            return JsonResult.success();
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "删除生活信息", e);
        }
    }

    @RequestMapping("/giveLike")
    public JsonResult<Void> giveLike(@RequestBody GiveLikeDTO likeDTO, HttpServletRequest request) {
        try {
            UserInfoPO userInfo = (UserInfoPO) request.getSession().getAttribute("userInfo");
            iLifeMessageService.giveLike(likeDTO, userInfo);
            return JsonResult.success();
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "点赞", e);
        }
    }

    /**
     * 取消点赞
     *
     * @param giveLikeDTO 消息ID
     * @param request     request请求
     * @return 取消成功或失败
     */
    @RequestMapping("/deleteLike")
    public JsonResult<Void> deleteLike(@RequestBody GiveLikeDTO giveLikeDTO, HttpServletRequest request) {
        try {
            UserInfoPO userInfo = (UserInfoPO) request.getSession().getAttribute("userInfo");
            iLifeMessageService.deleteLike(giveLikeDTO, userInfo);
            return JsonResult.success();
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "取消点赞", e);
        }
    }
}
