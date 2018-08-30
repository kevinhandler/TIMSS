package com.yc.tims.dao;

import org.apache.ibatis.annotations.Mapper;

import com.yc.tims.po.TimsAchievement;

@Mapper
public interface TimsAchievementMapper {
    int deleteByPrimaryKey(Integer achId);

    int insert(TimsAchievement record);

    int insertSelective(TimsAchievement record);

    TimsAchievement selectByPrimaryKey(Integer achId);

    int updateByPrimaryKeySelective(TimsAchievement record);

    int updateByPrimaryKey(TimsAchievement record);
}