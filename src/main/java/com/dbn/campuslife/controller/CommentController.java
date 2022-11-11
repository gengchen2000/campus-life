package com.dbn.campuslife.controller;

import com.dbn.campuslife.entity.comment.*;
import com.dbn.campuslife.entity.user.UserInfoPO;
import com.dbn.campuslife.service.ICommentService;
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
 * 评论控制层
 */
@RestController
@RequestMapping("/comment")
public class CommentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommentController.class);

    @Resource
    ICommentService iCommentService;

    @RequestMapping("/addComment")
    public JsonResult<Void> addComment(@RequestBody AddCommentDTO addCommentDTO, HttpServletRequest request) {
        try {
            UserInfoPO userInfo = (UserInfoPO) request.getSession().getAttribute("userInfo");
            iCommentService.addComment(addCommentDTO, userInfo);
            return JsonResult.success();
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "新增评论", e);
        }
    }

    /**
     * 评论信息查询
     *
     * @param listCommentDTO 评论ID
     * @param request        request请求获取登录人
     * @return 查询的所有评论信息
     */
    @RequestMapping("/listComment")
    public JsonResult<Result<CommentPO>> listComment(@RequestBody ListCommentDTO listCommentDTO, HttpServletRequest request) {
        try {
            UserInfoPO userInfo = (UserInfoPO) request.getSession().getAttribute("userInfo");
            return JsonResult.success(iCommentService.listComments(listCommentDTO, userInfo));
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "获取评论信息", e);
        }
    }

    /**
     * 删除评论
     *
     * @param deleteCommentDTO 评论ID
     * @param request          request请求
     * @return 删除成功或失败
     */
    @RequestMapping("/deleteComment")
    public JsonResult<Void> deleteComment(@RequestBody DeleteCommentDTO deleteCommentDTO, HttpServletRequest request) {
        try {
            UserInfoPO userInfo = (UserInfoPO) request.getSession().getAttribute("userInfo");
            iCommentService.deleteComment(deleteCommentDTO, userInfo);
            return JsonResult.success();
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "删除评论", e);
        }
    }

    /**
     * 新增评论点赞
     *
     * @param giveCommentLikeDTO 评论ID
     * @param request            request用户获取登录人信息
     * @return 成功或失败
     */
    @RequestMapping("/addCommentLike")
    public JsonResult<Void> addCommentLike(@RequestBody GiveCommentLikeDTO giveCommentLikeDTO, HttpServletRequest request) {
        try {
            UserInfoPO userInfo = (UserInfoPO) request.getSession().getAttribute("userInfo");
            iCommentService.giveLike(giveCommentLikeDTO, userInfo);
            return JsonResult.success();
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "新增评论点赞", e);
        }
    }

    /**
     * 删除评论
     *
     * @param giveCommentLikeDTO 删除评论的ID
     * @param request            request请求用于获取登录人
     * @return 成功或失败
     */
    @RequestMapping("/deleteCommentLike")
    public JsonResult<Void> deleteCommentLike(@RequestBody GiveCommentLikeDTO giveCommentLikeDTO, HttpServletRequest request) {
        try {
            UserInfoPO userInfo = (UserInfoPO) request.getSession().getAttribute("userInfo");
            iCommentService.deleteLike(giveCommentLikeDTO, userInfo);
            return JsonResult.success();
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "删除评论", e);
        }
    }
}
