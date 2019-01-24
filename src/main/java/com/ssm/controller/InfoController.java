package com.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.service.IInfoService;
import com.ssm.service.InfoServiceImpl;
import com.ssm.util.PagerUtil;

@Controller
public class InfoController {
	private static Logger LOGER= Logger.getLogger(InfoServiceImpl.class);
	@Autowired
	private IInfoService iInfoService;
	
	  /**
     * 跳转到personalInfo.jsp界面  
     */
	private final String SHOWPERSONALINFO = "web/info/personalInfo";
	 /**
     * 跳转到updatePassword.jsp界面  
     */
	private final String SHOWUPDATEPASSWORD = "web/info/updatePassword";
	
	@RequestMapping("/showPersonalInfo")
	public String showPersonalInfo(HttpServletRequest request){
		
		return SHOWPERSONALINFO;
	}
	
	@RequestMapping("/showUpdatePassword")
	public String showUpdatePassword(HttpServletRequest request){
		
		return SHOWUPDATEPASSWORD;
	}
}
