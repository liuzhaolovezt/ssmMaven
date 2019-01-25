package com.ssm.service;

import java.util.List;
import java.util.Map;

import com.ssm.model.Notice;
import com.ssm.model.NoticeCustom;
import com.ssm.model.NoticeExample;
import com.ssm.model.NoticeQueryVo;
import com.ssm.util.PagerUtil;

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
	/**
	 * 公告的分页查询
	 * @param   currentPage
	 * @return  PagerUtil
	 */
	public  PagerUtil findNoticePage(int currentPage);
	/**
	 * 添加
	 * @param record
	 * @return
	 */
	public  boolean insert(Notice record);
	
}
