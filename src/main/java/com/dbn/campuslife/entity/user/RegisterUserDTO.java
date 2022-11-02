package com.dbn.campuslife.entity.user;

import com.dbn.campuslife.util.NatureUtil;

/**
 * 用户注册请求实体类
 */
public class RegisterUserDTO implements NatureUtil<RegisterUserDTO> {
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 确认密码
     */
    private String passwordTwo;

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

    public String getPasswordTwo() {
        return passwordTwo;
    }

    public void setPasswordTwo(String passwordTwo) {
        this.passwordTwo = passwordTwo;
    }

    @Override
    public String toString() {
        return "RegisterUserDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", passwordTwo='" + passwordTwo + '\'' +
                '}';
    }
}
