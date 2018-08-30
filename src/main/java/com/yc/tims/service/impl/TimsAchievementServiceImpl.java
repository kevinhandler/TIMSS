package com.yc.tims.service.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.tims.dao.TimsAchievementMapper;
import com.yc.tims.po.TimsAchievement;
import com.yc.tims.service.TimsAchievementService;

@Service

public class TimsAchievementServiceImpl implements TimsAchievementService{
	
	@Autowired
	private TimsAchievementMapper timsAchievementMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer achId) {
		
		return timsAchievementMapper.deleteByPrimaryKey(achId);
	}

	@Override
	public int insert(TimsAchievement record) {
		
		return timsAchievementMapper.insert(record);
	}

	@Override
	public int insertSelective(TimsAchievement record) {
		
		return timsAchievementMapper.insertSelective(record);
	}

	@Override
	public TimsAchievement selectByPrimaryKey(Integer achId) {
		
		return timsAchievementMapper.selectByPrimaryKey(achId);
	}

	@Override
	public int updateByPrimaryKeySelective(TimsAchievement record) {
		
		return timsAchievementMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TimsAchievement record) {
		
		return timsAchievementMapper.updateByPrimaryKey(record);
	}
 
}
