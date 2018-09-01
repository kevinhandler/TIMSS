package com.yc.tims.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.yc.tims.po.TimsAchievement;
import com.yc.tims.po.TimsTechproject;

public interface TimsTechProjectService {
	int deleteByPrimaryKey(Integer tpId);

    int insert(TimsTechproject record);

    int insertSelective(TimsTechproject record);

    TimsTechproject selectByPrimaryKey(Integer tpId);

    int updateByPrimaryKeySelective(TimsTechproject record);

    int updateByPrimaryKey(TimsTechproject record);
    PageInfo findByPage(Integer n, Integer size, String tpName);
}
