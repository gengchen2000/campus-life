package com.dbn.campuslife.service.impl;

import com.dbn.campuslife.entity.message.AddMessageDTO;
import com.dbn.campuslife.entity.message.LifeMessageDTO;
import com.dbn.campuslife.entity.message.LifeMessagePO;
import com.dbn.campuslife.entity.user.UserInfoPO;
import com.dbn.campuslife.mapper.LifeMessageMapper;
import com.dbn.campuslife.service.ILifeMessageService;
import com.dbn.campuslife.util.Result;
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

    @Override
    public Result<LifeMessagePO> listLifeMessage(LifeMessageDTO lifeMessageDTO) {
        /*放入查询方式*/
        lifeMessageDTO.setType(LifeMessageDTO.PUBLIC_POWER);
        /*检查属性*/
        lifeMessageDTO.checkProperty();
        /*分页*/
        lifeMessageDTO.pageInit();

        return new Result<>(lifeMessageMapper.listLifeMessage(lifeMessageDTO), lifeMessageMapper.countLifeMessage(lifeMessageDTO));
    }
}
