package com.hjy.service.impl;

import com.hjy.model.Contract;
import com.hjy.service.ContractService;
import com.hjy.utils.Pager;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author HJY
 * @date 2020/9/8 17:35
 */
@Service("ContractService")
public class ContractServiceImpl implements ContractService {
    @Override
    public int insert(Contract entity) {
        return 0;
    }

    @Override
    public void deleteById(Serializable id) {

    }

    @Override
    public void update(Contract entity) {

    }

    @Override
    public void updateById(Contract entity) {

    }

    @Override
    public void deleteByEntity(Contract entity) {

    }

    @Override
    public void deleteByMap(Map<String, Object> params) {

    }

    @Override
    public List<Contract> listByMap(Map<String, Object> params) {
        return null;
    }

    @Override
    public List<Contract> listAll() {
        return null;
    }

    @Override
    public List<Contract> listAllByEntity(Contract entity) {
        return null;
    }

    @Override
    public Contract load(Serializable id) {
        return null;
    }

    @Override
    public Contract getById(Serializable id) {
        return null;
    }

    @Override
    public Contract getByMap(Map<String, Object> params) {
        return null;
    }

    @Override
    public Contract getByEntity(Contract entity) {
        return null;
    }

    @Override
    public Pager<Contract> findByMap(Map<String, Object> params) {
        return null;
    }

    @Override
    public Pager<Contract> findByEntity(Contract entity) {
        return null;
    }

    @Override
    public void insertBatch(List<Contract> list) {

    }

    @Override
    public void updateBatch(List<Contract> list) {

    }

    @Override
    public Map<String, Object> getBySql(String sql) {
        return null;
    }

    @Override
    public Contract getBySqlReturnEntity(String sql) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listBySqlReturnMap(String sql) {
        return null;
    }

    @Override
    public List<Contract> listBySqlReturnEntity(String sql) {
        return null;
    }

    @Override
    public Pager<Contract> findBySqlRerturnEntity(String sql) {
        return null;
    }

    @Override
    public void updateBysql(String sql) {

    }

    @Override
    public void deleteBySql(String sql) {

    }
}
