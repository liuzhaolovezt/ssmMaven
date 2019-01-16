package com.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.service.ILoginService;
import com.ssm.service.LoginServiceImpl;

@Controller
public class LoginController {
	private static Logger LOGER= Logger.getLogger(LoginServiceImpl.class);
	/**
	 * 跳转到登录界面
	 */
	private final String LOGIN = "web/login/login";
	/**
	 * 跳转到主界面
	 */
	private final String INDEX = "index";
	
	@Autowired
	private ILoginService iLoginService;
	/**
	 * 跳转到登录界面
	 * @return
	 */
	@RequestMapping("/login")
	public String login(){
		
		return LOGIN;
	}
	
	@RequestMapping("/index")
	public String getAdmin(String name,String psd,HttpServletRequest request){
		Boolean loginflag = iLoginService.vaildLogin(name, psd);
        //如果没有找到数据的话，或者为0
		if(!loginflag){
			request.setAttribute("error", "没有这个员工！");
        	return LOGIN;
        }
		request.setAttribute("name", name);
		return INDEX;
	}
	
	
	
}
