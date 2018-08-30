package com.yc.tims.service;

import com.yc.tims.po.UserRole;

public interface UserRoleService {
	int deleteByPrimaryKey(Integer id);

	int insert(UserRole record);

	int insertSelective(UserRole record);

	UserRole selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(UserRole record);

	int updateByPrimaryKey(UserRole record);
}
