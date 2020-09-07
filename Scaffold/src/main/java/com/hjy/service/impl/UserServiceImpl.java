package com.hjy.service.impl;

import com.hjy.dao.UserMapper;
import com.hjy.model.User;
import com.hjy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author HJY
 * @date 2020/9/3 10:56
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public User selectUser(long userId) {
        return userMapper.selecterUser(userId);
    }
}
