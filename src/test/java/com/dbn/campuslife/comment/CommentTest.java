package com.dbn.campuslife.comment;

import com.dbn.campuslife.CampusLifeApplicationTests;
import com.dbn.campuslife.entity.comment.CommentPO;
import com.dbn.campuslife.entity.comment.ListCommentDTO;
import com.dbn.campuslife.entity.user.UserInfoPO;
import com.dbn.campuslife.service.ICommentService;
import com.dbn.campuslife.util.Result;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

public class CommentTest extends CampusLifeApplicationTests {

    @Resource
    ICommentService iCommentService;

    @Test
    public void listComment() {

        Result<CommentPO> commentPOResult = iCommentService.listComments(new ListCommentDTO().with(ListCommentDTO::setLifeMessageId, 1), new UserInfoPO().with(UserInfoPO::setId, 1));

        commentPOResult.getData().forEach(System.out::println);
    }
}
