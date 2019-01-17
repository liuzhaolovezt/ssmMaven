package com.ssm.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.model.Notice;
import com.ssm.model.NoticeCustom;
import com.ssm.service.INoticeService;
import com.ssm.service.NoticeServiceImpl;
import com.ssm.util.PagerUtil;



@Controller
@RequestMapping("/notice")
public class NoticeController {
	private static Logger LOGER= Logger.getLogger(NoticeServiceImpl.class);
	  /**
     * 跳转到noticeList.jsp界面  
     */
	private final String SHOWNOTICE = "web/notice/noticeList";
  
	/**
     * 跳转到getPrice.jsp界面
     */
	private final String GETPRICE = "getPrice";
	
	@Autowired
	private INoticeService iNoticeService;
	
	@RequestMapping("/getPrice")
	public String getPrice(String trainnum,String startStation,String endStation,HttpServletRequest request){
		/**
		 * 效验前端传入参数是否为空
		 */
		if(StringUtils.isEmpty(trainnum)){
			//打印日志
			LOGER.error("getPrice()  trainnum is null");
			
			request.setAttribute("error", "车次不能为空");
			//return SHOWPRICE;
		}
		if(StringUtils.isEmpty(startStation)){
			//打印日志
			LOGER.error("getPrice()  start is null");
			request.setAttribute("error", "起始站不能为�?");
			//return SHOWPRICE;
		}
		if(StringUtils.isEmpty(endStation)){
			//打印日志
			LOGER.error("getPrice()  end is null");
			request.setAttribute("error", "终点站不能为�?");
			//return SHOWPRICE;
		}
		Double price=0.0 ;//= iNoticeService.startToEndProce(trainnum, startStation, endStation);
        //如果没有找到数据的话，或者为0
		if(price==null || price==0){
        	//return SHOWPRICE;
        }
		request.setAttribute("startToEndProce", price);
		request.setAttribute("trainnum", trainnum);
		request.setAttribute("startStation", startStation);
		request.setAttribute("endStation", endStation);
		return GETPRICE;
	}
	
	
	@RequestMapping("/showNotice")
	public String showNotice(int currentPage,HttpServletRequest request){
		//List<Notice> selectByExample = iNoticeService.selectByExample();
       // List<NoticeCustom> findNoticeList = iNoticeService.findNoticeList(null);
       
		int noticeNum=iNoticeService.countByExample(null);
		
		//总条数
		PagerUtil pagerUtil=new PagerUtil();
	    pagerUtil.setTotalRecord(noticeNum);
	    //第几页
	    //currentPage=1;
	    pagerUtil.setPage(currentPage);
	    //每页条数
		int pageSize=5;
	    pagerUtil.setSize(pageSize);
		//封装总页数
	    if(noticeNum% pageSize!=0){
	        pagerUtil.setTotalPage(noticeNum/ pageSize+1);
	    }else{
	    	pagerUtil.setTotalPage(noticeNum/ pageSize);
	    }
	    //(noticeNum% pageSize!=0)? (pagerUtil.setTotalPage(noticeNum/ pageSize+1):(pagerUtil.setTotalPage(noticeNum/ pageSize));
        
        
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("start",(currentPage-1)*pageSize);
		map.put("size", pageSize);
	    List<NoticeCustom> findNoticeList=iNoticeService.findNoticePage(map);
		request.setAttribute("noticeList", findNoticeList);
		request.setAttribute("pagerUtil", pagerUtil);
		return SHOWNOTICE;
	}
	
	
	
	
}
