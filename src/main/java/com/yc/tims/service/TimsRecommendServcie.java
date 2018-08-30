package com.yc.tims.service;

import com.yc.tims.po.TimsRecommend;

public interface TimsRecommendServcie {

	int deleteByPrimaryKey(Integer rId);

	int insert(TimsRecommend record);

	int insertSelective(TimsRecommend record);

	TimsRecommend selectByPrimaryKey(Integer rId);

	int updateByPrimaryKeySelective(TimsRecommend record);

	int updateByPrimaryKey(TimsRecommend record);
}
