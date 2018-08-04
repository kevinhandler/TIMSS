package com.yc.tims.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.tims.dao.TimsEmpMapper;
import com.yc.tims.po.TimsEmp;
import com.yc.tims.service.TimsEmpService;
@Service
public class TimsEmpServiceImpl implements TimsEmpService{

	@Autowired
	private TimsEmpMapper timsEmpMapper;
	@Override
	public int deleteByPrimaryKey(Integer empId) {
		
		return timsEmpMapper.deleteByPrimaryKey(empId);
	}

	@Override
	public int insert(TimsEmp record) {
		
		return timsEmpMapper.insert(record);
	}

	@Override
	public int insertSelective(TimsEmp record) {
		
		return timsEmpMapper.insertSelective(record);
	}

	@Override
	public TimsEmp selectByPrimaryKey(Integer empId) {
		
		return timsEmpMapper.selectByPrimaryKey(empId);
	}

	@Override
	public int updateByPrimaryKeySelective(TimsEmp record) {
		
		return timsEmpMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TimsEmp record) {
		
		return timsEmpMapper.updateByPrimaryKey(record);
	}
	
	@Override
	public TimsEmp isLogin(String name, String password) {
		return timsEmpMapper.isLogin(name, password);
	}
}
