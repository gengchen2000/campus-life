package com.dbn.campuslife.entity.message;

import com.dbn.campuslife.util.NatureUtil;

/**
 * 新增分享信息实体类
 */
public class AddMessageDTO implements NatureUtil<AddMessageDTO> {
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 分享信息
     */
    private String messageInfo;
    /**
     * 权限
     */
    private String power;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMessageInfo() {
        return messageInfo;
    }

    public void setMessageInfo(String messageInfo) {
        this.messageInfo = messageInfo;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "AddMessageDTO{" +
                "userId=" + userId +
                ", messageInfo='" + messageInfo + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}
