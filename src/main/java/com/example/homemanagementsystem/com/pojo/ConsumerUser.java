package com.example.homemanagementsystem.com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * 消费者
 */
public class ConsumerUser {
    private Integer Id; // 用户id
    private String username;    // 用户名
    private String name;    // 姓名
    private String password;    // 密码
    private Short sex;  // 性别，0 女 1 男
    private String address; // 地址
    private String phone;   // 手机号
    private String email;   // 邮箱
}
