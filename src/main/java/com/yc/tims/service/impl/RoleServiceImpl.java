package com.yc.tims.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.tims.dao.RoleMapper;
import com.yc.tims.po.Role;
import com.yc.tims.service.RoleService;

@Service
public class RoleServiceImpl  implements RoleService{

	@Autowired
	private RoleMapper roleMapper;
	@Override
	public int deleteByPrimaryKey(Integer roleId) {
		
		return roleMapper.deleteByPrimaryKey(roleId);
	}

	@Override
	public int insert(Role record) {
		
		return roleMapper.insert(record);
	}

	@Override
	public int insertSelective(Role record) {
		
		return roleMapper.insertSelective(record);
	}

	@Override
	public Role selectByPrimaryKey(Integer roleId) {
		
		return roleMapper.selectByPrimaryKey(roleId);
	}

	@Override
	public int updateByPrimaryKeySelective(Role record) {
		
		return roleMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Role record) {
		
		return roleMapper.updateByPrimaryKey(record);
	}

}
