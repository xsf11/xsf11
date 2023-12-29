package com.example.homemanagementsystem.com.vo;


import com.example.homemanagementsystem.com.pojo.Worker;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkerVo implements Serializable {
    private Integer id;
    private String username;    // 用户名
    private String name;    // 姓名
    private String password;    // 密码
    private Short sex;  // 性别，0 女，1 男
    private Short age;  // 年龄
    private String address; // 地址
    private String phone;   // 手机号
    private String email;   // 邮箱
    private String briefIntroduction;   // 简介
    private Short status;   // 工作状态，0 空闲，1 工作


   List<Worker> workers;
//    private String userName;
//    private String password;
//    private Integer gender;
//    private Date birthday;
//    private Integer deptID;
}
