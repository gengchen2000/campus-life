package com.dbn.campuslife.entity.message;

import com.dbn.campuslife.util.AbstractPageBO;
import com.dbn.campuslife.util.NatureUtil;
import io.swagger.annotations.ApiModelProperty;

/**
 * 生活信息请求实体类
 */
public class LifeMessageDTO extends AbstractPageBO implements NatureUtil<LifeMessageDTO> {

    /**
     * 查询所有公开的信息
     */
    public static final String PUBLIC_POWER = "PUBLIC";
    /**
     * 根据ID查询单条信息
     */
    public static final String GET_BY_ID = "GET_BY_ID";
    /**
     * 查询方式
     */
    @ApiModelProperty(required = true)
    private String type;

    /**
     * 当前登录人ID
     */
    @ApiModelProperty(required = true)
    private Integer userId;

    private Integer id;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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
}
