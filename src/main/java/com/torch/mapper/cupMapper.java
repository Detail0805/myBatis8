package com.torch.mapper;

import com.torch.model.cup;

public interface cupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(cup record);

    int insertSelective(cup record);

    cup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(cup record);

    int updateByPrimaryKey(cup record);
}