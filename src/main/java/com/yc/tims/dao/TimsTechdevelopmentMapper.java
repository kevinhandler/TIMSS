package com.yc.tims.dao;

import com.yc.tims.po.TimsTechdevelopment;

public interface TimsTechdevelopmentMapper {
    int deleteByPrimaryKey(Integer tdId);

    int insert(TimsTechdevelopment record);

    int insertSelective(TimsTechdevelopment record);

    TimsTechdevelopment selectByPrimaryKey(Integer tdId);

    int updateByPrimaryKeySelective(TimsTechdevelopment record);

    int updateByPrimaryKey(TimsTechdevelopment record);
}