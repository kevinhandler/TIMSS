package com.yc.tims.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.tims.dao.TimsTechprojectMapper;
import com.yc.tims.po.TimsTechproject;
import com.yc.tims.service.TimsTechProjectService;

@Service
public class TimsTechProjectServiceImpl implements TimsTechProjectService{
	@Autowired
	private TimsTechprojectMapper timsTechprojectMapper;

	@Override
	public int deleteByPrimaryKey(Integer tpId) {
		
		return timsTechprojectMapper.deleteByPrimaryKey(tpId);
	}

	@Override
	public int insert(TimsTechproject record) {
		
		return timsTechprojectMapper.insert(record);
	}

	@Override
	public int insertSelective(TimsTechproject record) {
		
		return timsTechprojectMapper.insertSelective(record);
	}

	@Override
	public TimsTechproject selectByPrimaryKey(Integer tpId) {
		
		return timsTechprojectMapper.selectByPrimaryKey(tpId);
	}

	@Override
	public int updateByPrimaryKeySelective(TimsTechproject record) {
		
		return timsTechprojectMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TimsTechproject record) {
		
		return timsTechprojectMapper.updateByPrimaryKeySelective(record);
	}
	
	
}
