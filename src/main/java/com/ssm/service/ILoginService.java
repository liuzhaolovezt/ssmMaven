package com.ssm.service;

import java.util.List;

import com.ssm.model.NoticeCustom;
import com.ssm.model.NoticeQueryVo;

public interface ILoginService {

	/**
	 * 
	 * @param name 用户名
	 * @param psd 密码
	 * @return 是否有此用户
	 */
	public boolean vaildLogin(String name,String psd); 
	
	
}
