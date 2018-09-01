package com.yc.tims.dao;

import org.apache.ibatis.annotations.Mapper;

import com.yc.tims.po.TimsTechtalents;

@Mapper
public interface TimsTechtalentsMapper {
    int deleteByPrimaryKey(Integer ttId);

    int insert(TimsTechtalents record);

    int insertSelective(TimsTechtalents record);

    TimsTechtalents selectByPrimaryKey(Integer ttId);

    int updateByPrimaryKeySelective(TimsTechtalents record);

    int updateByPrimaryKey(TimsTechtalents record);
    
    
}