package com.hjy.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * @author HJY
 * @date 2020/9/3 10:37
 * @Discription 用户实体类
 */
@Getter
@Setter
public class User {

    private String userid;
    private String username;
    private String password;
    private String name;
    private String telephone;

    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }


}
