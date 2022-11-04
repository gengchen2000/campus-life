package com.dbn.campuslife.service;

import com.dbn.campuslife.entity.message.AddMessageDTO;

public interface ILifeMessageService {

    /**
     * 新增分享
     *
     * @param addMessageDTO 分享信息
     * @param userId        用户ID
     */
    void addLifeMessage(AddMessageDTO addMessageDTO, Integer userId);
}
