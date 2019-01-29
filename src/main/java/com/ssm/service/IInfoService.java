package com.ssm.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssm.model.Notice;
import com.ssm.model.TUser;

public interface IInfoService {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException;
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException;

	/**
	 * 添加
	 * @param record
	 * @return
	 */
	public  boolean update(TUser tuser);
}
