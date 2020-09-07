package com.hjy.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author HJY
 * @date 2020/9/7 14:33
 */
@Getter
@Setter
public class Commodities {

    private String fruitid;
    private String name;
    private Double price;
    private String locality;
    private Date createtime;

    @Override
    public String toString() {
        return "Commodities{" +
                "fruitid='" + fruitid + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", locality='" + locality + '\'' +
                ", createtime=" + createtime +
                '}';
    }

}
