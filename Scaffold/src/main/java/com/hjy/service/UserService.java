package com.hjy.service;

import com.hjy.model.User;

/**
 * @author HJY
 * @date 2020/9/3 10:54
 * @discription service接口
 */
public interface UserService {

     User selectUser(long UserId);

}
