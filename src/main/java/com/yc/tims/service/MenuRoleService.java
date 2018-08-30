package com.yc.tims.service;

import com.yc.tims.po.RoleMenu;

public interface MenuRoleService {
	int deleteByPrimaryKey(Integer id);

	int insert(RoleMenu record);

	int insertSelective(RoleMenu record);

	RoleMenu selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(RoleMenu record);

	int updateByPrimaryKey(RoleMenu record);
}
