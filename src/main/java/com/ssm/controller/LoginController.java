package com.ssm.controller;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.model.TUser;
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
		TUser user = iLoginService.vaildLogin(name, psd);
        //如果没有找到数据的话，或者为0
		if(user==null){
			request.setAttribute("error", "没有这个员工！");
        	return LOGIN;
        }
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(user.getUserDate());

		//创建session对象
		HttpSession session = request.getSession(); 
		//把用户数据保存在session域对象中
		session.setAttribute("LoginUserId", name);
		session.setAttribute("LoginUserPw", psd);
		session.setAttribute("LoginUserAge", user.getUserAge());
		session.setAttribute("LoginDeptId", user.getDeptId());
		session.setAttribute("LoginJobId", user.getJobId());
		session.setAttribute("LoginUserName", user.getUserName());
		session.setAttribute("LoginUserSex", user.getUserSex());
		session.setAttribute("LoginUserSalary", user.getUserSalary());
		session.setAttribute("LoginUserTel", user.getUserTel());
		session.setAttribute("LoginUserAdd", user.getUserAdd());
		session.setAttribute("LoginUserEml", user.getUserEml());
		session.setAttribute("LoginUserDate", user.getUserDate());
		session.setAttribute("LoginUserPho", user.getUserPho());
		
		System.err.println(user.getUserPho());
		
		session.setAttribute("Date", dateString);
		
		session.setAttribute("LoginUser", user);
		
		return INDEX;
	}
	
	
	
}
