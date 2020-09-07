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
//@Component
public class User {

    private long id;
    private String email;
    private String mobile;
    private String username;
    private String role;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", username='" + username + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

}
