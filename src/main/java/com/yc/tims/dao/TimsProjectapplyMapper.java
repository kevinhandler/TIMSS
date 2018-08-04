package com.yc.tims.dao;

import java.util.List;

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

	List<TimsProjectapply> findByPage(Integer n, Integer size, String paName, String paSort, String paOrgan,
			String paStatus);
}