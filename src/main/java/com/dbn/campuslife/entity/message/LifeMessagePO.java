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
