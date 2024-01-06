package com.chichi.market.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * goods_type
 */
@Data
public class GoodsType implements Serializable {
    private Integer goodsTypeId;

    private Integer parentTypeId;

    private String typeName;

    private Integer sort;

    private String iconClass;

    private static final long serialVersionUID = 1L;

}
