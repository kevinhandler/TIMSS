package com.yc.tims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerTest {
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
	public String goApproveProject() {
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
		return "talentsManage/talentsSelect";
	}	
	
	@RequestMapping("showOnlineTalk")
	public String goOnlineTalk() {
		return "onlineService/onlineTalk";
	}	
}
