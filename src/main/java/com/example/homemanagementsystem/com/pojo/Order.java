package com.example.homemanagementsystem.com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * 订单表
 */
public class Order {
    private Integer Id; // 订单ID
    private Integer userId; // 用户id（外键）
    private Integer goodsId;    // 服务商品id（外键）
    private LocalDateTime createTime;   // 创建时间
}
