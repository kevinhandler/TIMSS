package com.yc.tims.dao;

import org.apache.ibatis.annotations.Mapper;

import com.yc.tims.po.TimsRecommend;
@Mapper
public interface TimsRecommendMapper {
    int deleteByPrimaryKey(Integer rId);

    int insert(TimsRecommend record);

    int insertSelective(TimsRecommend record);

    TimsRecommend selectByPrimaryKey(Integer rId);

    int updateByPrimaryKeySelective(TimsRecommend record);

    int updateByPrimaryKey(TimsRecommend record);
}