package com.yc.tims.dao;

import org.apache.ibatis.annotations.Mapper;

import com.yc.tims.po.TimsAwardapplication;

@Mapper
public interface TimsAwardapplicationMapper {
    int deleteByPrimaryKey(Integer aaId);

    int insert(TimsAwardapplication record);

    int insertSelective(TimsAwardapplication record);

    TimsAwardapplication selectByPrimaryKey(Integer aaId);

    int updateByPrimaryKeySelective(TimsAwardapplication record);

    int updateByPrimaryKey(TimsAwardapplication record);
}