package com.dbn.campuslife.mapper;

import com.dbn.campuslife.entity.message.AddMessageDTO;
import com.dbn.campuslife.entity.message.GiveLikeDTO;
import com.dbn.campuslife.entity.message.LifeMessageDTO;
import com.dbn.campuslife.entity.message.LifeMessagePO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LifeMessageMapper {

    /**
     * 新增分享
     *
     * @param addMessageDTO 分享信息
     */
    void addLifeMessage(AddMessageDTO addMessageDTO);

    /**
     * 查询分享信息
     *
     * @param lifeMessageDTO 查询条件
     * @return 分享信息
     */
    List<LifeMessagePO> listLifeMessage(LifeMessageDTO lifeMessageDTO);

    /**
     * 分享信息数量
     *
     * @param lifeMessageDTO 查询条件
     * @return 分享信息数量
     */
    Integer countLifeMessage(LifeMessageDTO lifeMessageDTO);

    void deleteLifeMessageById(Integer id);

    /**
     * 是否点赞成功
     * @param giveLikeDTO 用户id和消息id
     * @return true 点赞成功 false 此消息已经点过赞
     */
    boolean giveLike(GiveLikeDTO giveLikeDTO);

    void deleteLike(GiveLikeDTO giveLikeDTO);

}
