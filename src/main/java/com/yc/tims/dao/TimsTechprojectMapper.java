package com.yc.tims.dao;

import org.apache.ibatis.annotations.Mapper;

import com.yc.tims.po.TimsTechproject;

@Mapper
public interface TimsTechprojectMapper {
    int deleteByPrimaryKey(Integer tpId);

    int insert(TimsTechproject record);

    int insertSelective(TimsTechproject record);

    TimsTechproject selectByPrimaryKey(Integer tpId);

    int updateByPrimaryKeySelective(TimsTechproject record);

    int updateByPrimaryKey(TimsTechproject record);
}