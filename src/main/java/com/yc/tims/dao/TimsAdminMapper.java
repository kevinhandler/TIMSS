package com.yc.tims.dao;

import org.apache.ibatis.annotations.Mapper;

import com.yc.tims.po.TimsAdmin;

@Mapper
public interface TimsAdminMapper {
    int deleteByPrimaryKey(Integer adminId);

    int insert(TimsAdmin record);

    int insertSelective(TimsAdmin record);

    TimsAdmin selectByPrimaryKey(Integer adminId);

    int updateByPrimaryKeySelective(TimsAdmin record);

    int updateByPrimaryKey(TimsAdmin record);
}