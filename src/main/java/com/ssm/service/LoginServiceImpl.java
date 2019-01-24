package com.ssm.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.TUserMapper;
import com.ssm.model.TUser;

@Service("loginService")
public class LoginServiceImpl implements ILoginService {

	private static Logger LOGER= Logger.getLogger(LoginServiceImpl.class);
	@Autowired
	private TUserMapper tUserMapper;
	
	public TUser vaildLogin(String name, String psd) {
		//boolean flag = false;
		//打印日志
		LOGER.info("name="+name+"psd="+psd);
		TUser tUser = findByUserCount(name,psd);
		if(tUser!=null){
			return tUser;
		}
		return null;
	}

	/**
	 * 通过用户名和密码返回对象的条数
	 * @param name
	 * @param psd
	 * @return
	 */
	private TUser findByUserCount(String name, String psd){
		TUser user = new TUser();
		user.setUserName(name);
		user.setUserPw(psd);
		
		TUser list = tUserMapper.selectByPrimaryKey(name);
		
		if(list!=null&&psd.equals(list.getUserPw())){
			return list;
		}
		return null;
	}
}
