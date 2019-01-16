package com.ssm.service;

public interface ILoginService {

	/**
	 * 
	 * @param name 用户名
	 * @param psd 密码
	 * @return 是否有此用户
	 */
	public boolean vaildLogin(String name,String psd); 
}
