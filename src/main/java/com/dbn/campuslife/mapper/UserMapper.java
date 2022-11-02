package com.dbn.campuslife.mapper;

import com.dbn.campuslife.entity.user.RegisterUserDTO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户持久层对象
 */
@Mapper
public interface UserMapper {

    /**
     * 判断用户名是否存在
     *
     * @param username 用户名
     * @return ture: 存在 false: 不存在
     */
    boolean existUsername(String username);

    /**
     * 新增用户信息
     *
     * @param registerUserDTO 用户信息
     */
    void addUserInfo(RegisterUserDTO registerUserDTO);

}
