package com.yc.tims.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.tims.dao.MenuMapper;
import com.yc.tims.po.Menu;
import com.yc.tims.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService{

	@Autowired 
	private MenuMapper menuMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer menuId) {
		
		return menuMapper.deleteByPrimaryKey(menuId);
	}

	@Override
	public int insert(Menu record) {
		
		return menuMapper.insert(record);
	}

	@Override
	public int insertSelective(Menu record) {
		
		return menuMapper.insertSelective(record);
	}

	@Override
	public Menu selectByPrimaryKey(Integer menuId) {
		
		return menuMapper.selectByPrimaryKey(menuId);
	}

	@Override
	public int updateByPrimaryKeySelective(Menu record) {
		
		return menuMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Menu record) {
		
		return menuMapper.updateByPrimaryKey(record);
	}
}
