package com.ssm.service;

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
	
	public boolean vaildLogin(String name, String psd) {
		boolean flag = false;
		//打印日志
		LOGER.info("name="+name+"psd="+psd);
		int count = findByUserCount(name,psd);
		if(count>0){
			flag = true;
		}
		return flag;
	}

	/**
	 * 通过用户名和密码返回对象的条数
	 * @param name
	 * @param psd
	 * @return
	 */
	private int findByUserCount(String name, String psd){
		TUser user = new TUser();
		user.setUserName(name);
		user.setUserPw(psd);
		
		TUser list = tUserMapper.selectByPrimaryKey(name);
		
		if(list!=null&&psd.equals(list.getUserPw())){
			return 1;
		}
		return 0;
	}
}
