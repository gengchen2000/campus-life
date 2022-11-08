package com.dbn.campuslife.service.impl;

import com.dbn.campuslife.entity.comment.AddCommentDTO;
import com.dbn.campuslife.entity.user.UserInfoPO;
import com.dbn.campuslife.mapper.CommentMapper;
import com.dbn.campuslife.service.ICommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 评论服务层实现类
 */
@Service
public class CommentServiceImpl implements ICommentService {

    @Resource
    CommentMapper commentMapper;

    @Override
    public void addComment(AddCommentDTO addCommentDTO, UserInfoPO userInfo) {

        addCommentDTO.setUserId(userInfo.getId());

        commentMapper.addComment(addCommentDTO);
    }
}
