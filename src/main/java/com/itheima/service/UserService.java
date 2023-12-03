package com.itheima.service;

import com.itheima.pojo.User;

public interface UserService {
    /**
     * 根据用户名查询用户
     * @param username
     * @return
     */
    User findByUserName(String username);

    /**
     * 注册
     * @param username
     * @param password
     */
    void register(String username, String password);

    /**
     * 更新
     * @param user
     */
    void update(User user);

    //更新头像
    void updateAvatar(String avatarUrl);
}
