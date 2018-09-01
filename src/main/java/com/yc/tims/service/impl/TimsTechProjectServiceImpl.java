package com.yc.tims.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yc.tims.dao.TimsTechprojectMapper;
import com.yc.tims.po.TimsProjectapply;
import com.yc.tims.po.TimsTechproject;
import com.yc.tims.service.TimsTechProjectService;

@Service
public class TimsTechProjectServiceImpl implements TimsTechProjectService{
	@Autowired
	private TimsTechprojectMapper timsTechprojectMapper;

	@Override
	public int deleteByPrimaryKey(Integer tpId) {
		
		return timsTechprojectMapper.deleteByPrimaryKey(tpId);
	}

	@Override
	public int insert(TimsTechproject record) {
		
		return timsTechprojectMapper.insert(record);
	}

	@Override
	public int insertSelective(TimsTechproject record) {
		
		return timsTechprojectMapper.insertSelective(record);
	}

	@Override
	public TimsTechproject selectByPrimaryKey(Integer tpId) {
		
		return timsTechprojectMapper.selectByPrimaryKey(tpId);
	}

	@Override
	public int updateByPrimaryKeySelective(TimsTechproject record) {
		
		return timsTechprojectMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TimsTechproject record) {
		
		return timsTechprojectMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public PageInfo findByPage(Integer n, Integer size, String tpName) {
		
		Page<Object> page = PageHelper.startPage(n, size);
		page.setOrderBy("tpId");
		 List<TimsTechproject> timsTechprojects = timsTechprojectMapper.findByPage(n, size, tpName);
		PageInfo<TimsTechproject> pageInfo = new PageInfo<TimsTechproject>(timsTechprojects);
		return pageInfo;
	}
	
	
}
