package com.yc.tims.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.PageInfo;
import com.yc.tims.po.TimsProjectapply;

public interface TimsProjectApplyService {

	int deleteByPrimaryKey(Integer paId);

    int insert(TimsProjectapply record);

    int insertSelective(TimsProjectapply record);

    TimsProjectapply selectByPrimaryKey(Integer paId);

    int updateByPrimaryKeySelective(TimsProjectapply record);

    int updateByPrimaryKey(TimsProjectapply record);
    PageInfo findByPage(Integer n,Integer size,@Param("paName") String paName, @Param("paSort") String paSort,@Param("paOrgan") String paOrgan,@Param("paStatus") String paStatus);
    
}
