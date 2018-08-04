package com.yc.tims.service;

import com.yc.tims.po.TimsMessage;

public interface TimsMessageService {

	int deleteByPrimaryKey(Integer mId);

    int insert(TimsMessage record);

    int insertSelective(TimsMessage record);

    TimsMessage selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(TimsMessage record);

    int updateByPrimaryKey(TimsMessage record);
    
    
}
