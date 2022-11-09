package com.dbn.campuslife.entity.comment;

import com.dbn.campuslife.util.NatureUtil;
import io.swagger.annotations.ApiModelProperty;

public class ListCommentDTO implements NatureUtil<ListCommentDTO> {
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 评论ID
     */
    @ApiModelProperty(required = true)
    private Integer lifeMessageId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getLifeMessageId() {
        return lifeMessageId;
    }

    public void setLifeMessageId(Integer lifeMessageId) {
        this.lifeMessageId = lifeMessageId;
    }
}
