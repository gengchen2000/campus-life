package com.dbn.campuslife.entity.message;

public class LifeMessagePO {
    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 信息
     */
    private String messageInfo;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 昵称
     */
    private String personName;
    /**
     * 头像
     */
    private String headImage;
    /**
     * 分享信息的userId
     */
    private Integer userId;
    /**
     * 点赞数量
     */
    private Integer likeNum;
    /**
     * 当前登录人是否点赞
     */
    private boolean likeThis;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessageInfo() {
        return messageInfo;
    }

    public void setMessageInfo(String messageInfo) {
        this.messageInfo = messageInfo;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public boolean isLikeThis() {
        return likeThis;
    }

    public void setLikeThis(boolean likeThis) {
        this.likeThis = likeThis;
    }

    @Override
    public String toString() {
        return "LifeMessagePO{" +
                "id=" + id +
                ", messageInfo='" + messageInfo + '\'' +
                ", createTime='" + createTime + '\'' +
                ", personName='" + personName + '\'' +
                '}';
    }
}
