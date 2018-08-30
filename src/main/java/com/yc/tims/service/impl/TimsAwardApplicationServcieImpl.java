package com.yc.tims.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.tims.dao.TimsAwardapplicationMapper;
import com.yc.tims.po.TimsAchievement;
import com.yc.tims.po.TimsAwardapplication;
import com.yc.tims.service.TimsAchievementService;
import com.yc.tims.service.TimsAwardApplicationServcie;

@Service
public class TimsAwardApplicationServcieImpl implements TimsAwardApplicationServcie{

	@Autowired
	private TimsAwardapplicationMapper timsAwardApplicationMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer achId) {
		
		return timsAwardApplicationMapper.deleteByPrimaryKey(achId);
	}

	@Override
	public int insert(TimsAwardapplication record) {

		return timsAwardApplicationMapper.insert(record);
	}

	@Override
	public int insertSelective(TimsAwardapplication record) {

		return timsAwardApplicationMapper.insertSelective(record);
	}

	@Override
	public TimsAwardapplication selectByPrimaryKey(Integer aaId) {

		return timsAwardApplicationMapper.selectByPrimaryKey(aaId);
	}

	@Override
	public int updateByPrimaryKeySelective(TimsAwardapplication record) {

		return timsAwardApplicationMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TimsAwardapplication record) {

		return timsAwardApplicationMapper.updateByPrimaryKey(record);
	}

	

	
}
