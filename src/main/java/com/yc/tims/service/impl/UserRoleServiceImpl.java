package com.yc.tims.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.tims.dao.UserRoleMapper;
import com.yc.tims.po.UserRole;
import com.yc.tims.service.UserRoleService;

@Service
public class UserRoleServiceImpl implements UserRoleService{

	@Autowired 
	private UserRoleMapper userRoleMapper;
	@Override
	public int deleteByPrimaryKey(Integer id) {
		
		return userRoleMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(UserRole record) {
		
		return userRoleMapper.insert(record);
	}

	@Override
	public int insertSelective(UserRole record) {
		
		return userRoleMapper.insertSelective(record);
	}

	@Override
	public UserRole selectByPrimaryKey(Integer id) {
		
		return userRoleMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(UserRole record) {
		
		return userRoleMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(UserRole record) {
		
		return userRoleMapper.updateByPrimaryKey(record);
	}

}
