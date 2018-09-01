package com.yc.tims.controller;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.tims.dao.TimsEmpMapper;
import com.yc.tims.po.TimsEmp;
import com.yc.tims.service.TimsAdminService;
import com.yc.tims.service.TimsEmpService;

@Controller
public class EmpController {

	@Autowired
	private TimsEmpService timsEmpService;
	
	@RequestMapping("/")
	public String toLogin() {
		return "redirect:login";
	}
	
	@RequestMapping("/login")
	public String login(@Param("name")String name,@Param("password")String password , HttpSession session) {
		System.out.println("name:"+name+"password:"+password);
		TimsEmp emp = timsEmpService.isLogin(name, password);
		System.out.println("emp:"+emp);
		if (emp !=null) {
			session.setAttribute("loginEmp", emp);
			return "index_v1";
		}
		return "login";
	}
}
