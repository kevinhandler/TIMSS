package com.yc.tims.service;

import com.yc.tims.po.TimsProjectapply;

public interface TimsProjectApplyService {

	int deleteByPrimaryKey(Integer paId);

    int insert(TimsProjectapply record);

    int insertSelective(TimsProjectapply record);

    TimsProjectapply selectByPrimaryKey(Integer paId);

    int updateByPrimaryKeySelective(TimsProjectapply record);

    int updateByPrimaryKey(TimsProjectapply record);
}
