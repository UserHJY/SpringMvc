package com.hjy.service.impl;

import com.hjy.model.Commodities;
import com.hjy.service.CommoditiesService;
import com.hjy.utils.Pager;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author HJY
 * @date 2020/9/8 17:34
 */
@Service("CommoditiesService")
public class CommoditiesServiceImpl implements CommoditiesService {

    @Override
    public int insert(Commodities entity) {
        return 0;
    }

    @Override
    public void deleteById(Serializable id) {

    }

    @Override
    public void update(Commodities entity) {

    }

    @Override
    public void updateById(Commodities entity) {

    }

    @Override
    public void deleteByEntity(Commodities entity) {

    }

    @Override
    public void deleteByMap(Map<String, Object> params) {

    }

    @Override
    public List<Commodities> listByMap(Map<String, Object> params) {
        return null;
    }

    @Override
    public List<Commodities> listAll() {
        return null;
    }

    @Override
    public List<Commodities> listAllByEntity(Commodities entity) {
        return null;
    }

    @Override
    public Commodities load(Serializable id) {
        return null;
    }

    @Override
    public Commodities getById(Serializable id) {
        return null;
    }

    @Override
    public Commodities getByMap(Map<String, Object> params) {
        return null;
    }

    @Override
    public Commodities getByEntity(Commodities entity) {
        return null;
    }

    @Override
    public Pager<Commodities> findByMap(Map<String, Object> params) {
        return null;
    }

    @Override
    public Pager<Commodities> findByEntity(Commodities entity) {
        return null;
    }

    @Override
    public void insertBatch(List<Commodities> list) {

    }

    @Override
    public void updateBatch(List<Commodities> list) {

    }

    @Override
    public Map<String, Object> getBySql(String sql) {
        return null;
    }

    @Override
    public Commodities getBySqlReturnEntity(String sql) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listBySqlReturnMap(String sql) {
        return null;
    }

    @Override
    public List<Commodities> listBySqlReturnEntity(String sql) {
        return null;
    }

    @Override
    public Pager<Commodities> findBySqlRerturnEntity(String sql) {
        return null;
    }

    @Override
    public void updateBysql(String sql) {

    }

    @Override
    public void deleteBySql(String sql) {

    }
}
