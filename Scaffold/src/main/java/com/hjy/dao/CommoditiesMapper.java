package com.hjy.dao;

import com.hjy.model.Commodities;

import java.util.Date;

/**
 * @author HJY
 * @date 2020/9/7 14:41
 */
public interface CommoditiesMapper {

    Commodities addCommodity(String fruitid, String name, Double price, String locality, Date createtime);
    Commodities deleteCommodity(String fruitid);
    Commodities editCommodity();
    Commodities selectCommodity();

}
