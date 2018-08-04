package com.yc.tims.dao;

import com.yc.tims.po.TimsInfomation;

public interface TimsInfomationMapper {
    int deleteByPrimaryKey(Integer infoId);

    int insert(TimsInfomation record);

    int insertSelective(TimsInfomation record);

    TimsInfomation selectByPrimaryKey(Integer infoId);

    int updateByPrimaryKeySelective(TimsInfomation record);

    int updateByPrimaryKey(TimsInfomation record);
}