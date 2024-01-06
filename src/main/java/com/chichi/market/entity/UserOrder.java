package com.chichi.market.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * user_order
 */
@Data
public class UserOrder implements Serializable {
    private String orderId;

    private Double allCost;

    private Date createTime;

    private Date payTime;

    private String receiverPhone;

    private String receiverName;

    private String receiveAddress;

    private String payType;

    private String status;

    private Double actualPayment;

    private Double totalDeduction;

    private static final long serialVersionUID = 1L;

}
