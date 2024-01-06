package com.chichi.market.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * shop_car
 */
@Data
public class ShopCar implements Serializable {
    private Integer shopCarId;

    private Integer userId;

    private Integer goodsId;

    private Integer count;

    private static final long serialVersionUID = 1L;
}
