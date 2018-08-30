package com.yc.tims.service;

import com.yc.tims.po.Role;

public interface RoleService {
	int deleteByPrimaryKey(Integer roleId);

	int insert(Role record);

	int insertSelective(Role record);

	Role selectByPrimaryKey(Integer roleId);

	int updateByPrimaryKeySelective(Role record);

	int updateByPrimaryKey(Role record);
}
