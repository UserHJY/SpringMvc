package com.hjy.service.impl;

import com.hjy.model.Retailer;
import com.hjy.service.RetailerService;
import com.hjy.utils.Pager;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author HJY
 * @date 2020/9/8 17:35
 */
@Service("RetailerService")
public class RetailerServiceImpl implements RetailerService {
    @Override
    public int insert(Retailer entity) {
        return 0;
    }

    @Override
    public void deleteById(Serializable id) {

    }

    @Override
    public void update(Retailer entity) {

    }

    @Override
    public void updateById(Retailer entity) {

    }

    @Override
    public void deleteByEntity(Retailer entity) {

    }

    @Override
    public void deleteByMap(Map<String, Object> params) {

    }

    @Override
    public List<Retailer> listByMap(Map<String, Object> params) {
        return null;
    }

    @Override
    public List<Retailer> listAll() {
        return null;
    }

    @Override
    public List<Retailer> listAllByEntity(Retailer entity) {
        return null;
    }

    @Override
    public Retailer load(Serializable id) {
        return null;
    }

    @Override
    public Retailer getById(Serializable id) {
        return null;
    }

    @Override
    public Retailer getByMap(Map<String, Object> params) {
        return null;
    }

    @Override
    public Retailer getByEntity(Retailer entity) {
        return null;
    }

    @Override
    public Pager<Retailer> findByMap(Map<String, Object> params) {
        return null;
    }

    @Override
    public Pager<Retailer> findByEntity(Retailer entity) {
        return null;
    }

    @Override
    public void insertBatch(List<Retailer> list) {

    }

    @Override
    public void updateBatch(List<Retailer> list) {

    }

    @Override
    public Map<String, Object> getBySql(String sql) {
        return null;
    }

    @Override
    public Retailer getBySqlReturnEntity(String sql) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listBySqlReturnMap(String sql) {
        return null;
    }

    @Override
    public List<Retailer> listBySqlReturnEntity(String sql) {
        return null;
    }

    @Override
    public Pager<Retailer> findBySqlRerturnEntity(String sql) {
        return null;
    }

    @Override
    public void updateBysql(String sql) {

    }

    @Override
    public void deleteBySql(String sql) {

    }
}
