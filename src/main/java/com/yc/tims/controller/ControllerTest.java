package com.yc.tims.controller;

import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.stat.TableStat.Mode;
import com.github.pagehelper.PageInfo;
import com.yc.tims.po.TimsProjectapply;
import com.yc.tims.service.TimsProjectApplyService;

@Controller
public class ControllerTest {
	
	@Autowired
	private TimsProjectApplyService timsProjectApplyService;
	
	@RequestMapping("index")
	public String goIndex() {
		return "index_v1";
	}
	
	@RequestMapping("showMain")
	public String goMain() {
		return "main";
	}
	
	@RequestMapping("showIndex")
	public String goIndexPart() {
		return "releaseInfo/index";
	}
	
	@RequestMapping("/showApplyProject")
	public String goApplyProject() {
		return "applyItem/projectApply";
	}
	
	@RequestMapping("showManageApply")
	public String goManageApply() {
		return "applyItem/manageApply";
	}
	
	@RequestMapping("showAchieveApply")
	public String goAchieveApply() {
		return "applyItem/achieveApply";
	}
	
	@RequestMapping("showAwardApply")
	public String goAwardApply() {
		return "applyItem/awardApply";
	}
	
	@RequestMapping("showApproveProject")
	public String goApproveProject( @Param("paName") String paName, @Param("paSort") String paSort,@Param("paOrgan") String paOrgan,@Param("paStatus") String paStatus,
			@RequestParam(value="n",defaultValue="1")Integer n,@RequestParam(value="size",defaultValue="4") Integer size ,Map map) {
		System.out.println("paName:"+paName+"paSort:"+paSort+"paOrgan"+paOrgan+"pastatus"+paStatus);
		PageInfo pageInfo = timsProjectApplyService.findByPage(n, size, paName, paSort, paOrgan, paStatus);
		map.put("pageInfo", pageInfo);
		System.out.println(map);
		return "approveItem/approveProject";
	}
	@RequestMapping("showApproveManage")
	public String goApproveManage() {
		return "approveItem/approveManage";
	}
	
	@RequestMapping("showApproveTechPayoffs")
	public String goApproveTechPayoffs() {
		return "approveItem/approveTechPayoffs";
	}

	@RequestMapping("showApproveReward")
	public String goApproveReward() {
		return "approveItem/approveReward";
	}	
	
	@RequestMapping("showAddTalents")
	public String goAddTalents() {
		return "talentsManage/addTalents";
	}	
	
	@RequestMapping("showTalentsSelect")
	public String goTalentsSelect() {
		return "talentsManage/user";
	}	
	
	@RequestMapping("showOnlineTalk")
	public String goOnlineTalk() {
		return "onlineService/onlineTalk";
	}	
}
