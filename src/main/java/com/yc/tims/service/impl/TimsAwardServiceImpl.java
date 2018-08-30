package com.yc.tims.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.tims.dao.TimsAwardMapper;
import com.yc.tims.po.TimsAward;

import com.yc.tims.service.TimsAwardService;
@Service
public class TimsAwardServiceImpl implements TimsAwardService{

	@Autowired
	private TimsAwardMapper timsAwardMapper;

	@Override
	public int deleteByPrimaryKey(Integer aId) {
		
		return timsAwardMapper.deleteByPrimaryKey(aId);
	}

	@Override
	public int insert(TimsAward record) {
		
		return timsAwardMapper.insert(record);
	}

	@Override
	public int insertSelective(TimsAward record) {
		
		return timsAwardMapper.insertSelective(record);
	}

	@Override
	public TimsAward selectByPrimaryKey(Integer aId) {
		
		return timsAwardMapper.selectByPrimaryKey(aId);
	}

	@Override
	public int updateByPrimaryKeySelective(TimsAward record) {
		
		return timsAwardMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TimsAward record) {
		
		return timsAwardMapper.updateByPrimaryKey(record);
	}
	
	
}
