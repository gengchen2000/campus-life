package com.dbn.campuslife.service.impl;

import com.dbn.campuslife.entity.comment.AddCommentDTO;
import com.dbn.campuslife.entity.comment.CommentPO;
import com.dbn.campuslife.entity.comment.ListCommentDTO;
import com.dbn.campuslife.entity.user.UserInfoPO;
import com.dbn.campuslife.mapper.CommentMapper;
import com.dbn.campuslife.service.ICommentService;
import com.dbn.campuslife.util.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        addCommentDTO.checkProperty();

        commentMapper.addComment(addCommentDTO);
    }

    @Override
    public Result<CommentPO> listComments(ListCommentDTO listCommentDTO, UserInfoPO userInfo) {

        Map<Integer, CommentPO> map = new Hashtable<>();

        commentMapper.listComments(listCommentDTO).parallelStream().forEach(s -> {
            CommentPO comment = map.get(s.getId());
            if (comment != null) {
                s.addAllChildren(comment.getChildren());
            }
            map.put(s.getId(), s);
            comment = map.get(s.getParentId());
            if (comment != null) {
                comment.addChildren(s);
            } else {
                map.put(s.getParentId(), new CommentPO().addChildren(s));
            }
        });
        List<CommentPO> comments = map.entrySet().parallelStream().filter(s -> s.getKey() == 0).map(Map.Entry::getValue).collect(Collectors.toList()).get(0).getChildren();
        comments.sort(Comparator.comparingInt(CommentPO::getLikeNum));
        return new Result<>(comments, 0);
    }
}
