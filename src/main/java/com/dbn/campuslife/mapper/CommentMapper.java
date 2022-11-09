package com.dbn.campuslife.mapper;

import com.dbn.campuslife.entity.comment.AddCommentDTO;
import com.dbn.campuslife.entity.comment.CommentPO;
import com.dbn.campuslife.entity.comment.ListCommentDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 生活信息评论持久层
 */
@Mapper
public interface CommentMapper {

    void addComment(AddCommentDTO addCommentDTO);

    List<CommentPO> listComments(ListCommentDTO listCommentDTO);

}
