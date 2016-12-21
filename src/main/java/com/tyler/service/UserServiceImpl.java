package com.tyler.service;

import com.tyler.dao.UserMapper;
import com.tyler.model.User;

/**
 * Created by tyler on 2016/12/21.
 */
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User selectUser(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
