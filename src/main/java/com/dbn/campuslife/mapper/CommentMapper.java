package com.dbn.campuslife.mapper;

import com.dbn.campuslife.entity.comment.AddCommentDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 生活信息评论持久层
 */
@Mapper
public interface CommentMapper {

    void addComment(AddCommentDTO addCommentDTO);

}
