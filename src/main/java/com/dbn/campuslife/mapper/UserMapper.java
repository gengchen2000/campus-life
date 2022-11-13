package com.dbn.campuslife.mapper;

import com.dbn.campuslife.entity.user.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

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


    /**
     * 关注
     *
     * @param attentionUserDTO 关注人ID
     */
    void addAttentionUser(AttentionUserDTO attentionUserDTO);

    /**
     * 取消关注
     *
     * @param attentionUserDTO 取消关注人ID
     */
    void deleteAttentionUser(AttentionUserDTO attentionUserDTO);

    /**
     * 查找除了当前登录人所有的用户
     *
     * @param listUserDTO 当前登录人ID
     * @return 除了当前登录人所有的用户
     */
    List<UserInfoPO> listAllUsers(ListUserDTO listUserDTO);

    UserInfoPO getTargetUserInfo(TargetUserDTO targetUserDTO);
}
