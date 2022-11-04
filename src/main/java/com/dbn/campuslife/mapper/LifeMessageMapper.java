package com.dbn.campuslife.mapper;

import com.dbn.campuslife.entity.message.AddMessageDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LifeMessageMapper {

    /**
     * 新增分享
     *
     * @param addMessageDTO 分享信息
     */
    void addLifeMessage(AddMessageDTO addMessageDTO);

}
