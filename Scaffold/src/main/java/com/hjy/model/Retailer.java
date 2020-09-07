package com.hjy.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author HJY
 * @date 2020/9/7 14:35
 */
@Getter
@Setter
public class Retailer {

    private String name;
    private String retailerid;
    private String telephone;
    private String address;
    private int status;
    private Date createtime;

    @Override
    public String toString() {
        return "Retailer{" +
                "name='" + name + '\'' +
                ", retailerid='" + retailerid + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                ", createtime=" + createtime +
                '}';
    }

}
