package com.ssm.service;

import java.util.List;

import com.ssm.model.Notice;
import com.ssm.model.NoticeCustom;
import com.ssm.model.NoticeExample;
import com.ssm.model.NoticeQueryVo;

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
	
	/**
	 * 查询所有公告信息，并对应相应user信息
	 * @param exampleVo
	 * @return
	 */
	public List<NoticeCustom> findNoticeList(NoticeQueryVo exampleVo);
	
}
