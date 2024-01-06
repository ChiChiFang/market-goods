package com.chichi.market.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * order_info
 */
@Data
public class OrderInfo implements Serializable {
    private Integer orderInfoId;

    private String orderId;

    private Integer originGoodId;

    private Long price;

    private Integer count;

    private String img;

    private Double oldPrice;

    private static final long serialVersionUID = 1L;
}
