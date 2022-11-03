package com.dbn.campuslife.entity.user;

import com.dbn.campuslife.util.CheckPropertyUtil;
import com.dbn.campuslife.util.NatureUtil;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户登录请求实体类
 */
public class LoginUserDTO extends CheckPropertyUtil implements NatureUtil<LoginUserDTO> {
    /**
     * 用户名
     */
    @ApiModelProperty(required = true)
    private String username;
    /**
     * 密码
     */
    @ApiModelProperty(required = true)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginUserDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
