package com.yc.tims.dao;

import org.apache.ibatis.annotations.Mapper;

import com.yc.tims.po.TimsAuthority;

@Mapper
public interface TimsAuthorityMapper {
    int deleteByPrimaryKey(Integer authId);

    int insert(TimsAuthority record);

    int insertSelective(TimsAuthority record);

    TimsAuthority selectByPrimaryKey(Integer authId);

    int updateByPrimaryKeySelective(TimsAuthority record);

    int updateByPrimaryKey(TimsAuthority record);
}