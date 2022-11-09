package com.dbn.campuslife.entity.comment;

import com.dbn.campuslife.util.CheckPropertyUtil;
import io.swagger.annotations.ApiModelProperty;

public class AddCommentDTO extends CheckPropertyUtil {

    /**
     * 登录人ID
     */
    @ApiModelProperty(required = true)
    private Integer userId;
    /**
     * 生活信息ID
     */
    @ApiModelProperty(required = true)
    private Integer lifeMessageId;
    /**
     * 评论信息
     */
    @ApiModelProperty(required = true)
    private String commentInfo;


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

    public String getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(String commentInfo) {
        this.commentInfo = commentInfo;
    }

    @Override
    public String toString() {
        return "AddCommentDTO{" +
                "userId=" + userId +
                ", lifeMessageId=" + lifeMessageId +
                ", commentInfo='" + commentInfo + '\'' +
                '}';
    }
}