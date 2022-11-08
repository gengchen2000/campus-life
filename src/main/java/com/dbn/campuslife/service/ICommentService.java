package com.dbn.campuslife.service;

import com.dbn.campuslife.entity.comment.AddCommentDTO;
import com.dbn.campuslife.entity.user.UserInfoPO;

/**
 * 评论服务层接口
 */
public interface ICommentService {

    /**
     * 新增评论
     *
     * @param addCommentDTO 评论的信息ID和评论内容
     * @param userInfo      当前登录人信息
     */
    void addComment(AddCommentDTO addCommentDTO, UserInfoPO userInfo);

}
