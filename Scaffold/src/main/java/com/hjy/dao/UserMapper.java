package com.hjy.dao;

import com.hjy.model.User;

/**
 * @author HJY
 * @date 2020/9/3 10:49
 */
public interface UserMapper {

    User selecterUser(long id);
}
