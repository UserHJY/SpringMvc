package com.hjy.service.impl;

import com.hjy.dao.UserMapper;
import com.hjy.model.User;
import com.hjy.service.UserService;
import com.hjy.utils.Pager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

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

    @Override
    public int insert(User entity) {
        return 0;
    }

    @Override
    public void deleteById(Serializable id) {

    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void updateById(User entity) {

    }

    @Override
    public void deleteByEntity(User entity) {

    }

    @Override
    public void deleteByMap(Map<String, Object> params) {

    }

    @Override
    public List<User> listByMap(Map<String, Object> params) {
        return null;
    }

    @Override
    public List<User> listAll() {
        return null;
    }

    @Override
    public List<User> listAllByEntity(User entity) {
        return null;
    }

    @Override
    public User load(Serializable id) {
        return null;
    }

    @Override
    public User getById(Serializable id) {
        return null;
    }

    @Override
    public User getByMap(Map<String, Object> params) {
        return null;
    }

    @Override
    public User getByEntity(User entity) {
        return null;
    }

    @Override
    public Pager<User> findByMap(Map<String, Object> params) {
        return null;
    }

    @Override
    public Pager<User> findByEntity(User entity) {
        return null;
    }

    @Override
    public void insertBatch(List<User> list) {

    }

    @Override
    public void updateBatch(List<User> list) {

    }

    @Override
    public Map<String, Object> getBySql(String sql) {
        return null;
    }

    @Override
    public User getBySqlReturnEntity(String sql) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listBySqlReturnMap(String sql) {
        return null;
    }

    @Override
    public List<User> listBySqlReturnEntity(String sql) {
        return null;
    }

    @Override
    public Pager<User> findBySqlRerturnEntity(String sql) {
        return null;
    }

    @Override
    public void updateBysql(String sql) {

    }

    @Override
    public void deleteBySql(String sql) {

    }
}
