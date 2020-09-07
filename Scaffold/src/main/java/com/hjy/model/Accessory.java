package com.hjy.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author HJY
 * @date 2020/9/7 14:30
 *
 */
@Getter
@Setter
public class Accessory {

    private String accessoryid;
    private String fruitid;
    private String name;
    private String price;
    private Date createtime;

    @Override
    public String toString() {
        return "Accessory{" +
                "accessoryid='" + accessoryid + '\'' +
                ", fruitid='" + fruitid + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", createtime=" + createtime +
                '}';
    }

}
