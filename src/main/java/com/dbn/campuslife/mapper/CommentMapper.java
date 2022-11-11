package com.dbn.campuslife.mapper;

import com.dbn.campuslife.entity.comment.*;
import com.dbn.campuslife.entity.message.GiveMessageLikeDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 生活信息评论持久层
 */
@Mapper
public interface CommentMapper {

    /**
     * 新增评论
     *
     * @param addCommentDTO 新增评论内容
     */
    void addComment(AddCommentDTO addCommentDTO);

    /**
     * 评论查询
     *
     * @param listCommentDTO 评论查询条件
     * @return 查询的评论
     */
    List<CommentPO> listComments(ListCommentDTO listCommentDTO);

    /**
     * 删除的评论
     *
     * @param deleteCommentDTO 删除的评论
     * @return 删除成功还是失败
     */
    boolean deleteComment(DeleteCommentDTO deleteCommentDTO);

    /**
     * 是否点赞成功
     *
     * @param giveCommentLikeDTO 点赞评论ID
     * @return true成功 false 失败
     */
    boolean giveLike(GiveCommentLikeDTO giveCommentLikeDTO);

    /**
     * 取消点赞
     *
     * @param giveCommentLikeDTO 取消点赞ID
     */
    void deleteLike(GiveCommentLikeDTO giveCommentLikeDTO);
}
