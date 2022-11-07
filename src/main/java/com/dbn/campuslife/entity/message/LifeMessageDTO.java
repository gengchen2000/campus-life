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
     * 查询方式
     */
    @ApiModelProperty(required = true)
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
