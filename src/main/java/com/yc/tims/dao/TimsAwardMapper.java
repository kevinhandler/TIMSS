package com.yc.tims.dao;

import org.apache.ibatis.annotations.Mapper;

import com.yc.tims.po.TimsAward;

@Mapper
public interface TimsAwardMapper {
    int deleteByPrimaryKey(Integer aId);

    int insert(TimsAward record);

    int insertSelective(TimsAward record);

    TimsAward selectByPrimaryKey(Integer aId);

    int updateByPrimaryKeySelective(TimsAward record);

    int updateByPrimaryKey(TimsAward record);
}