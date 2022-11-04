package com.dbn.campuslife.service.impl;

import com.dbn.campuslife.entity.message.AddMessageDTO;
import com.dbn.campuslife.entity.user.UserInfoPO;
import com.dbn.campuslife.mapper.LifeMessageMapper;
import com.dbn.campuslife.service.ILifeMessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Service
public class LifeMessageServiceImpl implements ILifeMessageService {

    @Resource
    LifeMessageMapper lifeMessageMapper;

    @Override
    public void addLifeMessage(AddMessageDTO addMessageDTO, Integer userId) {

        addMessageDTO.setUserId(userId);
        /*新增消息*/
        lifeMessageMapper.addLifeMessage(addMessageDTO);
    }

}
