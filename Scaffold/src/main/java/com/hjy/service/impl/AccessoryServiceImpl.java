package com.hjy.service.impl;

import com.hjy.model.Accessory;
import com.hjy.service.AccessoryService;
import com.hjy.utils.Pager;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author HJY
 * @date 2020/9/8 17:34
 */
@Service("AccessoryService")
public class AccessoryServiceImpl implements AccessoryService {

    @Override
    public int insert(Accessory entity) {
        return 0;
    }

    @Override
    public void deleteById(Serializable id) {

    }

    @Override
    public void update(Accessory entity) {

    }

    @Override
    public void updateById(Accessory entity) {

    }

    @Override
    public void deleteByEntity(Accessory entity) {

    }

    @Override
    public void deleteByMap(Map<String, Object> params) {

    }

    @Override
    public List<Accessory> listByMap(Map<String, Object> params) {
        return null;
    }

    @Override
    public List<Accessory> listAll() {
        return null;
    }

    @Override
    public List<Accessory> listAllByEntity(Accessory entity) {
        return null;
    }

    @Override
    public Accessory load(Serializable id) {
        return null;
    }

    @Override
    public Accessory getById(Serializable id) {
        return null;
    }

    @Override
    public Accessory getByMap(Map<String, Object> params) {
        return null;
    }

    @Override
    public Accessory getByEntity(Accessory entity) {
        return null;
    }

    @Override
    public Pager<Accessory> findByMap(Map<String, Object> params) {
        return null;
    }

    @Override
    public Pager<Accessory> findByEntity(Accessory entity) {
        return null;
    }

    @Override
    public void insertBatch(List<Accessory> list) {

    }

    @Override
    public void updateBatch(List<Accessory> list) {

    }

    @Override
    public Map<String, Object> getBySql(String sql) {
        return null;
    }

    @Override
    public Accessory getBySqlReturnEntity(String sql) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listBySqlReturnMap(String sql) {
        return null;
    }

    @Override
    public List<Accessory> listBySqlReturnEntity(String sql) {
        return null;
    }

    @Override
    public Pager<Accessory> findBySqlRerturnEntity(String sql) {
        return null;
    }

    @Override
    public void updateBysql(String sql) {

    }

    @Override
    public void deleteBySql(String sql) {

    }
}
