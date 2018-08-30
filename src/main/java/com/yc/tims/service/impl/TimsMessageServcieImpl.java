package com.yc.tims.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.tims.dao.TimsMessageMapper;
import com.yc.tims.po.TimsMessage;
import com.yc.tims.service.TimsMessageService;
@Service
public class TimsMessageServcieImpl implements TimsMessageService{

	@Autowired
	private TimsMessageMapper timsMeesageMapper;
	@Override
	public int deleteByPrimaryKey(Integer mId) {
		
		return timsMeesageMapper.deleteByPrimaryKey(mId);
	}

	@Override
	public int insert(TimsMessage record) {
		
		return timsMeesageMapper.insert(record);
	}

	@Override
	public int insertSelective(TimsMessage record) {
		
		return timsMeesageMapper.insertSelective(record);
	}

	@Override
	public TimsMessage selectByPrimaryKey(Integer mId) {
		
		return timsMeesageMapper.selectByPrimaryKey(mId);
	}

	@Override
	public int updateByPrimaryKeySelective(TimsMessage record) {
		
		return timsMeesageMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TimsMessage record) {
		
		return timsMeesageMapper.updateByPrimaryKey(record);
	}
	
}
