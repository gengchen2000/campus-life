package com.dbn.campuslife.entity.message;

import com.dbn.campuslife.util.NatureUtil;

public class GiveMessageLikeDTO implements NatureUtil<GiveMessageLikeDTO> {
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 分享信息ID
     */
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
