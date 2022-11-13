package com.dbn.campuslife.entity.user;

import com.dbn.campuslife.util.CheckPropertyUtil;

public class ListUserDTO extends CheckPropertyUtil {
    private Integer userId;

    /**
     * 昵称
     */
    private String personName;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /**
     * 查询方式默认所有
     */
    private String type;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
