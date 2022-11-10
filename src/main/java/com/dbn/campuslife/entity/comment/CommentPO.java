package com.dbn.campuslife.entity.comment;

import java.util.ArrayList;
import java.util.List;

public class CommentPO {
    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 用户名
     */
    private String personName;
    /**
     * 回复人昵称
     */
    private String replayPersonName;
    /**
     * 是否是回复
     */
    private boolean replay;
    /**
     * 父ID
     */
    private Integer parentId;
    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 点赞数量
     */
    private Integer likeNum;

    /**
     * 回复内容
     */
    private String commentInfo;
    /**
     * 头像名称
     */
    private String headImage;

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    private final List<CommentPO> children = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getReplayPersonName() {
        return replayPersonName;
    }

    public void setReplayPersonName(String replayPersonName) {
        this.replayPersonName = replayPersonName;
    }

    public boolean isReplay() {
        return replay;
    }

    public void setReplay(boolean replay) {
        this.replay = replay;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<CommentPO> getChildren() {
        return children;
    }

    public CommentPO addChildren(CommentPO comment) {
        this.children.add(comment);
        return this;
    }

    public void addAllChildren(List<CommentPO> comments) {
        this.children.addAll(comments);
    }

    public String getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(String commentInfo) {
        this.commentInfo = commentInfo;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    @Override
    public String toString() {
        return "CommentPO{" +
                "id=" + id +
                ", userId=" + userId +
                ", personName='" + personName + '\'' +
                ", replayPersonName='" + replayPersonName + '\'' +
                ", replay='" + replay + '\'' +
                ", parentId=" + parentId +
                ", createTime='" + createTime + '\'' +
                ", likeNum=" + likeNum +
                ", children=" + children +
                '}';
    }
}
