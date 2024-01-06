package com.chichi.market.entity;
import lombok.Data;

import java.io.Serializable;

/**
 * goods
 */
@Data
public class Goods implements Serializable {
    private Integer goodsId;

    private String title;

    private String img;

    private Integer goodsTypeId;

    private Double oldPrice;

    private Long price;

    private String onSale;

    private Integer detail;

    private Integer count;

    private static final long serialVersionUID = 1L;

}
