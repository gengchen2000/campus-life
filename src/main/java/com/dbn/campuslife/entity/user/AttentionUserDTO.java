package com.dbn.campuslife.entity.user;

public class AttentionUserDTO {
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 关注用户ID
     */
    private Integer attentionUserId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAttentionUserId() {
        return attentionUserId;
    }

    public void setAttentionUserId(Integer attentionUserId) {
        this.attentionUserId = attentionUserId;
    }

}
