package com.dbn.campuslife.life;

import com.dbn.campuslife.CampusLifeApplicationTests;
import com.dbn.campuslife.entity.message.GiveLikeDTO;
import com.dbn.campuslife.entity.message.LifeMessageDTO;
import com.dbn.campuslife.mapper.LifeMessageMapper;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

public class LifeTest extends CampusLifeApplicationTests {

    @Resource
    LifeMessageMapper lifeMessageMapper;

    @Test
    public void listLifeMessage() {
        LifeMessageDTO lifeMessageDTO = new LifeMessageDTO()
                .with(LifeMessageDTO::setPageIndex, 2)
                .with(LifeMessageDTO::setPageSize, 3)
                .with(LifeMessageDTO::setType, LifeMessageDTO.PUBLIC_POWER);
        /*必填属性检查*/
        lifeMessageDTO.checkProperty();
        /*分页初始化*/
        lifeMessageDTO.pageInit();
        lifeMessageMapper.listLifeMessage(lifeMessageDTO).forEach(System.out::println);

        System.out.println(lifeMessageMapper.countLifeMessage(lifeMessageDTO));
    }

    @Test
    public void giveLike() {
        System.out.println(lifeMessageMapper.giveLike(new GiveLikeDTO()
                .with(GiveLikeDTO::setUserId, 1)
                .with(GiveLikeDTO::setLifeMessageId, 2)));
    }
}
