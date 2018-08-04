package com.yc.tims.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.yc.tims.po.TimsProjectapply;
import com.yc.tims.service.TimsProjectApplyService;
import com.yc.tims.service.TimsTechProjectService;
import com.yc.tims.utils.FileUtil;

@Controller
public class ProjectApplyConroller {
	
	@Autowired
	private TimsProjectApplyService timsProjectApplyService;
	
	@RequestMapping("addProjectApply")
	@ResponseBody
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
			projectapply.setPaStatus("未审批");
			result = timsProjectApplyService.insertSelective(projectapply);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return String.valueOf(result);
	}
	@RequestMapping("findProjectApply")
	@ResponseBody
	public String  findProjectApply(Integer paId) {
		TimsProjectapply timsProjectapply = timsProjectApplyService.selectByPrimaryKey(paId);
		System.out.println(timsProjectapply);
		return JSONObject.toJSONString(timsProjectapply);
	}
	
	@RequestMapping("updateProjectApply")
	public void updateProjectApply(TimsProjectapply projectapply  ) {
		projectapply.setPaStatus("已审批");
		timsProjectApplyService.updateByPrimaryKeySelective(projectapply);
	}
}
