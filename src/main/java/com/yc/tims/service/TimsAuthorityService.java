package com.yc.tims.service;

import com.yc.tims.po.TimsAuthority;

public interface TimsAuthorityService {
	int deleteByPrimaryKey(Integer authId);

	int insert(TimsAuthority record);

	int insertSelective(TimsAuthority record);

	TimsAuthority selectByPrimaryKey(Integer authId);

	int updateByPrimaryKeySelective(TimsAuthority record);

	int updateByPrimaryKey(TimsAuthority record);
}
