package com.yc.tims.service;

import com.yc.tims.po.TimsAdmin;
import com.yc.tims.po.TimsEmp;

public interface TimsAdminService {

	int deleteByPrimaryKey(Integer adminId);

	int insert(TimsAdmin record);

	int insertSelective(TimsAdmin record);

	TimsAdmin selectByPrimaryKey(Integer adminId);

	int updateByPrimaryKeySelective(TimsAdmin record);

	int updateByPrimaryKey(TimsAdmin record);
	
	
}
