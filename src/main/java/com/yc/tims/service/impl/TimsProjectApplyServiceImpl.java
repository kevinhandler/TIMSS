package com.yc.tims.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yc.tims.dao.TimsProjectapplyMapper;
import com.yc.tims.po.TimsProjectapply;
import com.yc.tims.service.TimsProjectApplyService;
@Service
public class TimsProjectApplyServiceImpl implements TimsProjectApplyService{

	@Autowired
	private TimsProjectapplyMapper timsProjectapplyMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer paId) {
		
		return timsProjectapplyMapper.deleteByPrimaryKey(paId);
	}

	@Override
	public int insert(TimsProjectapply record) {
		
		return timsProjectapplyMapper.insert(record);
	}

	@Override
	public int insertSelective(TimsProjectapply record) {
		
		return timsProjectapplyMapper.insertSelective(record);
	}

	@Override
	public TimsProjectapply selectByPrimaryKey(Integer paId) {
		
		return timsProjectapplyMapper.selectByPrimaryKey(paId);
	}

	@Override
	public int updateByPrimaryKeySelective(TimsProjectapply record) {
		
		return timsProjectapplyMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(TimsProjectapply record) {
		
		return timsProjectapplyMapper.updateByPrimaryKey(record);
	}
	
	/**
	 * 分页查询
	 */
	@Override
	public PageInfo findByPage(Integer n, Integer size, @Param("paName") String paName, @Param("paSort") String paSort,@Param("paOrgan") String paOrgan,@Param("paStatus") String paStatus) {
		Page<Object> page = PageHelper.startPage(n, size);
		page.setOrderBy("pa_id");
		System.out.println("service层：paName:"+paName+"paSort:"+paSort+"paOrgan： "+paOrgan+"pastatus： "+paStatus);
		List<TimsProjectapply> timsProjectapplys = timsProjectapplyMapper.findByPage(n, size, paName,paSort,paOrgan,paStatus);
		PageInfo<TimsProjectapply> pageInfo = new PageInfo<TimsProjectapply>(timsProjectapplys);
		return pageInfo;
	}

}
