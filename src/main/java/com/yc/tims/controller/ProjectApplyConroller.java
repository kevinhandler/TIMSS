package com.yc.tims.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.yc.tims.po.TimsProjectapply;
import com.yc.tims.service.TimsProjectApplyService;
import com.yc.tims.utils.FileUtil;

@Controller
public class ProjectApplyConroller {
	
	@Autowired
	private TimsProjectApplyService timsProjectApplyService;
	
	@RequestMapping("addProjectApply")
	public String addProjectApply( TimsProjectapply projectapply,BindingResult br, @RequestParam("file") MultipartFile file,HttpServletRequest request) {
		System.out.println("projectapply"+projectapply);
		//文件的路径
		String realPath = request.getSession().getServletContext().getRealPath("attach/");
		//附件的全路径
		String fileName=file.getOriginalFilename();
		System.out.println("realpath"+realPath);
		String fullPath=realPath+fileName;
		int result = 0;
		try {
			FileUtil.uploadFile(file.getBytes(), realPath, fileName);
			//设置附件的全路径
			projectapply.setPaAttrch(fullPath);
			result = timsProjectApplyService.insertSelective(projectapply);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (result>0) {
			return "releaseInfo/index";
		} else {
			return "applyItem/projectApply";
		}
	}
}
