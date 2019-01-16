package com.ssm.model;

/**
* Notice扩展对象
* 用于继承Notice类，直接获取Notice对象的字段
* 并添加一些扩展字段
*
*/
public class NoticeCustom extends Notice {
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
