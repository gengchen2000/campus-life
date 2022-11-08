package com.dbn.campuslife.service;

import com.dbn.campuslife.entity.message.AddMessageDTO;
import com.dbn.campuslife.entity.message.GiveLikeDTO;
import com.dbn.campuslife.entity.message.LifeMessageDTO;
import com.dbn.campuslife.entity.message.LifeMessagePO;
import com.dbn.campuslife.entity.user.UserInfoPO;
import com.dbn.campuslife.util.Result;
import org.apache.catalina.User;

public interface ILifeMessageService {

    /**
     * 新增分享
     *
     * @param addMessageDTO 分享信息
     * @param userId        用户ID
     */
    void addLifeMessage(AddMessageDTO addMessageDTO, Integer userId);

    Result<LifeMessagePO> listLifeMessage(LifeMessageDTO lifeMessageDTO, UserInfoPO userInfo);

    /**
     * 根据ID删除信息
     *
     * @param lifeMessageDTO 消息ID
     * @param userInfo       当前登录人信息
     */
    void deleteLifeMessageById(LifeMessageDTO lifeMessageDTO, UserInfoPO userInfo);

    /**
     * 点赞功能
     *
     * @param giveLikeDTO 点赞信息ID
     * @param userInfo    用户信息
     */
    void giveLike(GiveLikeDTO giveLikeDTO, UserInfoPO userInfo);

    /**
     * 取消点赞
     *
     * @param giveLikeDTO 消息ID
     * @param userInfo    登录人信息
     */
    void deleteLike(GiveLikeDTO giveLikeDTO, UserInfoPO userInfo);
}
