package com.dbn.campuslife.service.impl;

import com.dbn.campuslife.entity.message.AddMessageDTO;
import com.dbn.campuslife.entity.message.GiveMessageLikeDTO;
import com.dbn.campuslife.entity.message.LifeMessageDTO;
import com.dbn.campuslife.entity.message.LifeMessagePO;
import com.dbn.campuslife.entity.user.UserInfoPO;
import com.dbn.campuslife.exception.BusinessException;
import com.dbn.campuslife.mapper.LifeMessageMapper;
import com.dbn.campuslife.service.ILifeMessageService;
import com.dbn.campuslife.util.Result;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

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
    public Result<LifeMessagePO> listLifeMessage(LifeMessageDTO lifeMessageDTO, UserInfoPO userInfo) {
        /*放入查询方式*/
        lifeMessageDTO.setType(LifeMessageDTO.PUBLIC_POWER);
        /*检查属性*/
        return getLifeMessagePOResult(lifeMessageDTO, userInfo);
    }

    @Override
    public void deleteLifeMessageById(LifeMessageDTO lifeMessageDTO, UserInfoPO userInfo) {
        /*设置查询方式为根据ID查询*/
        lifeMessageDTO.setType(LifeMessageDTO.GET_BY_ID);
        List<LifeMessagePO> lifeMessage = lifeMessageMapper.listLifeMessage(lifeMessageDTO);
        if (lifeMessage.size() != 0) {
            LifeMessagePO lifeMessagePO = lifeMessage.get(0);
            /*判断登录人ID和分享信息的userId是否相同*/
            if (Objects.equals(userInfo.getId(), lifeMessagePO.getUserId())) {
                lifeMessageMapper.deleteLifeMessageById(lifeMessageDTO.getId());
            } else {
                throw new BusinessException("所选消息不是当前登录人新建");
            }
        } else {
            throw new BusinessException("所选消息不存在");
        }
    }

    @Override
    public void giveLike(GiveMessageLikeDTO giveLikeDTO, UserInfoPO userInfo) {
        giveLikeDTO.setUserId(userInfo.getId());

        boolean flag = lifeMessageMapper.giveLike(giveLikeDTO);
        /*判断是否点赞成功*/
        if (!flag) {
            throw new BusinessException("此消息已经点过赞");
        }
    }

    @Override
    public void deleteLike(GiveMessageLikeDTO giveLikeDTO, UserInfoPO userInfo) {
        /*获取用户ID*/
        giveLikeDTO.setUserId(userInfo.getId());

        lifeMessageMapper.deleteLike(giveLikeDTO);
    }

    @Override
    public Result<LifeMessagePO> listUserLifeMessage(LifeMessageDTO lifeMessageDTO, UserInfoPO userInfo) {
        /*设置查询方式为根据ID查询*/
        lifeMessageDTO.setType(LifeMessageDTO.USER_POWER);
        /*默认是当前登录人ID*/
        if (lifeMessageDTO.getTargetUserId() == null) {
            lifeMessageDTO.setTargetUserId(userInfo.getId());
        }
        return getLifeMessagePOResult(lifeMessageDTO, userInfo);
    }

    @NotNull
    private Result<LifeMessagePO> getLifeMessagePOResult(LifeMessageDTO lifeMessageDTO, UserInfoPO userInfo) {
        /*检查属性*/
        lifeMessageDTO.checkProperty();
        /*分页*/
        lifeMessageDTO.pageInit();
        /*给定当前登录人ID*/
        lifeMessageDTO.setUserId(userInfo.getId());

        return new Result<>(lifeMessageMapper.listLifeMessage(lifeMessageDTO), lifeMessageMapper.countLifeMessage(lifeMessageDTO));
    }

}
