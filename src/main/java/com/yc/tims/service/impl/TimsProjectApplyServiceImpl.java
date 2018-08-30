package com.yc.tims.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.tims.dao.TimsProjectapplyMapper;
import com.yc.tims.po.TimsProjectapply;
import com.yc.tims.service.TimsProjectApplyService;
@Service
public class TimsProjectApplyServiceImpl implements TimsProjectApplyService{

	@Autowired
	private TimsProjectapplyMapper timsProjectapplyMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer paId) {
		
		return timsProjectapplyMapper.deleteByPrimaryKey(paId);
	}

	@Override
	public int insert(TimsProjectapply record) {
		
		return timsProjectapplyMapper.insert(record);
	}

	@Override
	public int insertSelective(TimsProjectapply record) {
		
		return timsProjectapplyMapper.insertSelective(record);
	}

	@Override
	public TimsProjectapply selectByPrimaryKey(Integer paId) {
		
		return timsProjectapplyMapper.selectByPrimaryKey(paId);
	}

	@Override
	public int updateByPrimaryKeySelective(TimsProjectapply record) {
		
		return timsProjectapplyMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TimsProjectapply record) {
		
		return timsProjectapplyMapper.updateByPrimaryKey(record);
	}

}
