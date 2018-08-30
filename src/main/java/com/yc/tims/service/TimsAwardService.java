package com.yc.tims.service;

import com.yc.tims.po.TimsAward;

public interface TimsAwardService {

	int deleteByPrimaryKey(Integer aId);

    int insert(TimsAward record);

    int insertSelective(TimsAward record);

    TimsAward selectByPrimaryKey(Integer aId);

    int updateByPrimaryKeySelective(TimsAward record);

    int updateByPrimaryKey(TimsAward record);
}
