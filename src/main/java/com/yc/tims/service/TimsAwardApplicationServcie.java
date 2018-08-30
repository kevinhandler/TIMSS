package com.yc.tims.service;

import com.yc.tims.po.TimsAwardapplication;

public interface TimsAwardApplicationServcie {

	int deleteByPrimaryKey(Integer aaId);

	int insert(TimsAwardapplication record);

	int insertSelective(TimsAwardapplication record);

	TimsAwardapplication selectByPrimaryKey(Integer aaId);

	int updateByPrimaryKeySelective(TimsAwardapplication record);

	int updateByPrimaryKey(TimsAwardapplication record);
}
