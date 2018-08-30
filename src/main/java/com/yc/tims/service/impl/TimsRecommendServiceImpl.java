package com.yc.tims.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.tims.dao.TimsRecommendMapper;
import com.yc.tims.po.TimsRecommend;
import com.yc.tims.service.TimsRecommendServcie;

@Service
public class TimsRecommendServiceImpl implements TimsRecommendServcie{

	@Autowired
	private TimsRecommendMapper timsRecommendMapper;
	@Override
	public int deleteByPrimaryKey(Integer rId) {
		
		return timsRecommendMapper.deleteByPrimaryKey(rId);
	}

	@Override
	public int insert(TimsRecommend record) {
		
		return timsRecommendMapper.insert(record);
	}

	@Override
	public int insertSelective(TimsRecommend record) {
		
		return timsRecommendMapper.insertSelective(record);
	}

	@Override
	public TimsRecommend selectByPrimaryKey(Integer rId) {
		
		return timsRecommendMapper.selectByPrimaryKey(rId);
	}

	@Override
	public int updateByPrimaryKeySelective(TimsRecommend record) {
		
		return timsRecommendMapper.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKey(TimsRecommend record) {
		
		return timsRecommendMapper.updateByPrimaryKey(record);
	}

}
