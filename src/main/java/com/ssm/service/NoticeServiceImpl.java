package com.ssm.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lz.service.StationServiceImpl;
import com.ssm.dao.NoticeMapper;
import com.ssm.model.Notice;
import com.ssm.model.NoticeExample;

@Service("noticeService")
public class NoticeServiceImpl implements INoticeService{

	private static Logger LOGER= Logger.getLogger(NoticeServiceImpl.class);
	
	@Autowired
	private NoticeMapper noticeMapper;
	@Override
	public List<Notice> selectByExample() {
		List<Notice> noticeList=noticeMapper.selectByExample(null);
		LOGER.info("selectByExample() noticeList = "+noticeList);
		return noticeList;
	}
	@Override
	public int countByExample(NoticeExample example) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	/*public  int countByExample(NoticeExample example){
		
	}*/

	
	
}
