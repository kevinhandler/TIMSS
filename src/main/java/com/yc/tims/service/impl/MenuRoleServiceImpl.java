package com.yc.tims.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.tims.dao.RoleMenuMapper;
import com.yc.tims.po.RoleMenu;
import com.yc.tims.service.MenuRoleService;

@Service
public class MenuRoleServiceImpl implements MenuRoleService{

	@Autowired
	private RoleMenuMapper roleMenuMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		
		return roleMenuMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(RoleMenu record) {
		
		return roleMenuMapper.insert(record);
	}

	@Override
	public int insertSelective(RoleMenu record) {
		
		return roleMenuMapper.insertSelective(record);
	}

	@Override
	public RoleMenu selectByPrimaryKey(Integer id) {
		
		return roleMenuMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(RoleMenu record) {
		
		return roleMenuMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(RoleMenu record) {
		
		return roleMenuMapper.updateByPrimaryKey(record);
	}

}
