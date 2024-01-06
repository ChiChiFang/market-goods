package com.chichi.market.dao;

import com.chichi.market.entity.OrderInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderInfoDao {
    int deleteByPrimaryKey(Integer orderInfoId);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(Integer orderInfoId);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);
}