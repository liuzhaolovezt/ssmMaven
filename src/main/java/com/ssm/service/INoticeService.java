package com.ssm.service;

import java.util.List;

import com.ssm.model.Notice;
import com.ssm.model.NoticeExample;

public interface INoticeService {

	/**
	 * 查询所有公告信息
	 * @return
	 */
	public  List<Notice> selectByExample();
	/**
	 * 查询公告条数
	 * @param example
	 * @return
	 */
	public int countByExample(NoticeExample example);
	
}
