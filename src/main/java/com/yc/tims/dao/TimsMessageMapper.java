package com.yc.tims.dao;

import org.apache.ibatis.annotations.Mapper;

import com.yc.tims.po.TimsMessage;

@Mapper
public interface TimsMessageMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(TimsMessage record);

    int insertSelective(TimsMessage record);

    TimsMessage selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(TimsMessage record);

    int updateByPrimaryKey(TimsMessage record);
}