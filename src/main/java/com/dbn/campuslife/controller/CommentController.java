package com.dbn.campuslife.controller;

import com.dbn.campuslife.entity.comment.AddCommentDTO;
import com.dbn.campuslife.entity.comment.CommentPO;
import com.dbn.campuslife.entity.comment.ListCommentDTO;
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

    @RequestMapping("/listComment")
    public JsonResult<Result<CommentPO>> listComment(@RequestBody ListCommentDTO listCommentDTO, HttpServletRequest request) {
        try {
            UserInfoPO userInfo = (UserInfoPO) request.getSession().getAttribute("userInfo");
            return JsonResult.success(iCommentService.listComments(listCommentDTO, userInfo));
        } catch (Exception e) {
            return JsonResult.fail(LOGGER, "获取评论信息", e);
        }
    }
}
