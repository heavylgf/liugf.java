package com.zhss.springboot.service;

import com.zhss.springboot.domain.User;

import java.util.List;

/**
 * 用户管理模块的service组件接口
 * Created by CTWLPC on 2018/9/18.
 */
public interface UserService {

    /**
     * 查询用户
     * @return 用户信息
     */
    List<User> listUsers();

    /**
     * 根据ID查询用户
     * @param id 用户id
     * @return 用户信息
     */
    User getUserById(Long id);

    /**
     * 新增用户
     * @param user 用户信息
     */
    void saveUser(User user);

    /**
     * 更新用户
     * @param user 用户信息
     */
    void updateUser(User user);

    /**
     * 删除用户
     * @param id 用户ID
     */
    void romoveUser(Long id);

}
