package com.yc.tims.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.tims.dao.TimsAdminMapper;
import com.yc.tims.po.TimsAdmin;
import com.yc.tims.service.TimsAdminService;

@Service
public class TimsAdminServiceImpl implements TimsAdminService{
	@Autowired
	private TimsAdminMapper timsAdminMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer adminId) {

		return timsAdminMapper.deleteByPrimaryKey(adminId);
	}

	@Override
	public int insert(TimsAdmin record) {

		return timsAdminMapper.insert(record);
	}

	@Override
	public int insertSelective(TimsAdmin record) {

		return timsAdminMapper.insertSelective(record);
	}

	@Override
	public TimsAdmin selectByPrimaryKey(Integer adminId) {

		return timsAdminMapper.selectByPrimaryKey(adminId);
	}

	@Override
	public int updateByPrimaryKeySelective(TimsAdmin record) {

		return timsAdminMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TimsAdmin record) {

		return timsAdminMapper.updateByPrimaryKey(record);
	}

}
