package com.example.homemanagementsystem.com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * 分页查询结果封装
 */
public class pageBean {

    private Long total; // 总记录数
    private List rows;  // 数据列表

}
