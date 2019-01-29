package com.ssm.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.model.TUser;
import com.ssm.service.IInfoService;
import com.ssm.service.InfoServiceImpl;

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
	
	@RequestMapping("/upLoadImg")
	public String upLoadImg(HttpServletRequest req,HttpServletResponse resp)
	throws IOException{
		System.err.print("laile!");
		iInfoService.doPost(req, resp);
		return SHOWPERSONALINFO;
	}
	
		@RequestMapping("/updateInfo")
		public String updateInfo(Model model, @ModelAttribute("TUser") TUser tUser) {
			System.err.println(tUser.getUserPho());
			
			boolean flag= iInfoService.update(tUser);
			if(flag){
				model.addAttribute("result", "success");
			}else{
				model.addAttribute("result", "false");
			}
		
		return SHOWUPDATEPASSWORD;
	}
	
}
