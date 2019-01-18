package com.ssm.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.NoticeMapper;
import com.ssm.model.Notice;
import com.ssm.model.NoticeCustom;
import com.ssm.model.NoticeExample;
import com.ssm.model.NoticeQueryVo;
import com.ssm.util.PagerUtil;

@Service("noticeService")
public class NoticeServiceImpl implements INoticeService {

	private static Logger LOGER = Logger.getLogger(NoticeServiceImpl.class);

	@Autowired
	private NoticeMapper noticeMapper;

	@Override
	public List<Notice> selectByExample() {
		List<Notice> noticeList = noticeMapper.selectByExample(null);
		LOGER.info("selectByExample() noticeList = " + noticeList);
		return noticeList;
	}

	@Override
	public int countByExample(NoticeExample example) {

		return noticeMapper.countByExample(example);
	}

	@Override
	public List<NoticeCustom> findNoticeList(NoticeQueryVo exampleVo) {
		return noticeMapper.findNoticeList(exampleVo);
	}

	/**
	 * 分页查询公告
	 */
	@Override
	public PagerUtil findNoticePage(int currentPage) {
		// 总条数
		int noticeNum = this.countByExample(null);
		PagerUtil pagerUtil=PagerUtil.getPagerUtil(currentPage, noticeNum,5);
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("start", (currentPage - 1) * pagerUtil.getSize());
		map.put("size", pagerUtil.getSize());
		List<NoticeCustom> notice = noticeMapper.findNoticePage(map);
		pagerUtil.setData(notice);
		
		return pagerUtil;
	}

}
