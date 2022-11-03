package com.dbn.campuslife.entity.user;

import com.dbn.campuslife.util.NatureUtil;

/**
 * 用户登录请求实体类
 */
public class LoginUserDTO implements NatureUtil<LoginUserDTO> {
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
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
