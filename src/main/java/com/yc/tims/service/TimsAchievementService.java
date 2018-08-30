package com.yc.tims.service;

import com.yc.tims.po.TimsAchievement;

public interface TimsAchievementService {
	int deleteByPrimaryKey(Integer achId);

	int insert(TimsAchievement record);

	int insertSelective(TimsAchievement record);

	TimsAchievement selectByPrimaryKey(Integer achId);

	int updateByPrimaryKeySelective(TimsAchievement record);

	int updateByPrimaryKey(TimsAchievement record);
}
