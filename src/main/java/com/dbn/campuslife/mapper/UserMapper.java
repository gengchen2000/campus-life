package com.dbn.campuslife.mapper;

import com.dbn.campuslife.entity.user.RegisterUserDTO;
import com.dbn.campuslife.entity.user.UpdateUser;
import com.dbn.campuslife.entity.user.UserInfoPO;
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
     * @return 用户名的数量
     */
    Integer existUsername(String username);

    /**
     * 新增用户信息
     *
     * @param registerUserDTO 用户信息
     */
    void addUserInfo(RegisterUserDTO registerUserDTO);

    /**
     * 通过username获取用户信息
     *
     * @param username 用户名
     * @return 用户信息
     */
    UserInfoPO getUserInfoByUserName(String username);

    void updateUserInfoById(UpdateUser updateUser);


}
