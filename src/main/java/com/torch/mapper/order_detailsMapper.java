package com.torch.mapper;

import com.torch.model.order_details;

public interface order_detailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(order_details record);

    int insertSelective(order_details record);

    order_details selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(order_details record);

    int updateByPrimaryKey(order_details record);
}