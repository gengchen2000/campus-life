package com.dbn.campuslife.service;

import com.dbn.campuslife.entity.message.AddMessageDTO;
import com.dbn.campuslife.entity.message.LifeMessageDTO;
import com.dbn.campuslife.entity.message.LifeMessagePO;
import com.dbn.campuslife.util.Result;

public interface ILifeMessageService {

    /**
     * 新增分享
     *
     * @param addMessageDTO 分享信息
     * @param userId        用户ID
     */
    void addLifeMessage(AddMessageDTO addMessageDTO, Integer userId);

    Result<LifeMessagePO> listLifeMessage(LifeMessageDTO lifeMessageDTO);
}
