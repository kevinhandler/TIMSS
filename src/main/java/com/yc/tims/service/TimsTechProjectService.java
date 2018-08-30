package com.yc.tims.service;

import com.yc.tims.po.TimsAchievement;
import com.yc.tims.po.TimsTechproject;

public interface TimsTechProjectService {
	int deleteByPrimaryKey(Integer tpId);

    int insert(TimsTechproject record);

    int insertSelective(TimsTechproject record);

    TimsTechproject selectByPrimaryKey(Integer tpId);

    int updateByPrimaryKeySelective(TimsTechproject record);

    int updateByPrimaryKey(TimsTechproject record);
}
