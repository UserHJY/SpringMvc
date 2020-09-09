package com.hjy.dao;

import com.hjy.base.BaseDao;
import com.hjy.model.User;

/**
 * @author HJY
 * @date 2020/9/3 10:49
 */
public interface UserMapper extends BaseDao<User> {

    User selecterUser(long id);
}
