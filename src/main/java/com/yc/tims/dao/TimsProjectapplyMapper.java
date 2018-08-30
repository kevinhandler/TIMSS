package com.yc.tims.dao;

import org.apache.ibatis.annotations.Mapper;

import com.yc.tims.po.TimsProjectapply;

@Mapper
public interface TimsProjectapplyMapper {
    int deleteByPrimaryKey(Integer paId);

    int insert(TimsProjectapply record);

    int insertSelective(TimsProjectapply record);

    TimsProjectapply selectByPrimaryKey(Integer paId);

    int updateByPrimaryKeySelective(TimsProjectapply record);

    int updateByPrimaryKey(TimsProjectapply record);
}