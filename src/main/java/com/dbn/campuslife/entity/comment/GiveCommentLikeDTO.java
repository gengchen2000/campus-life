package com.dbn.campuslife.entity.comment;

import com.dbn.campuslife.util.CheckPropertyUtil;
import com.dbn.campuslife.util.NatureUtil;
import io.swagger.annotations.ApiModelProperty;

public class GiveCommentLikeDTO extends CheckPropertyUtil implements NatureUtil<GiveCommentLikeDTO> {
    /**
     * 用户ID
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
