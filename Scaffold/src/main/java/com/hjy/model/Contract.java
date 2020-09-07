package com.hjy.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author HJY
 * @date 2020/9/7 14:37
 */
@Getter
@Setter
public class Contract {

    private String contractid;
    private String barcode;
    private int type;
    private String retailerid;
    private Date createtime;

    @Override
    public String toString() {
        return "Contract{" +
                "contractid='" + contractid + '\'' +
                ", barcode='" + barcode + '\'' +
                ", type=" + type +
                ", retailerid='" + retailerid + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}
