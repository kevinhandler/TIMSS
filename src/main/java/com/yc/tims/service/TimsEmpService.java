package com.yc.tims.service;

import com.yc.tims.po.TimsEmp;

public interface TimsEmpService {

	int deleteByPrimaryKey(Integer empId);

	int insert(TimsEmp record);

	int insertSelective(TimsEmp record);

	TimsEmp selectByPrimaryKey(Integer empId);

	int updateByPrimaryKeySelective(TimsEmp record);

	int updateByPrimaryKey(TimsEmp record);
	
	TimsEmp isLogin(String name,String password);
}
