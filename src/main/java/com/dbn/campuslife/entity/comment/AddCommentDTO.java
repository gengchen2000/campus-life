package com.dbn.campuslife.entity.comment;

public class AddCommentDTO {

    /**
     * 登录人ID
     */
    private Integer userId;
    /**
     * 生活信息ID
     */
    private Integer lifeMessageId;
    /**
     * 评论信息
     */
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