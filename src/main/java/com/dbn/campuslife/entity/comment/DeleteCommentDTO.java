package com.dbn.campuslife.entity.comment;

import com.dbn.campuslife.util.CheckPropertyUtil;
import io.swagger.annotations.ApiModelProperty;

public class DeleteCommentDTO extends CheckPropertyUtil {
    /**
     * 登录人ID
     */
    @ApiModelProperty(required = true)
    private Integer userId;
    /**
     * 评论ID
     */
    @ApiModelProperty(required = true)
    private Integer commentId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }
}
