package com.lz.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lz.service.IStationService;
import com.lz.service.StationServiceImpl;

@Controller
public class StationController {
	private static Logger LOGER= Logger.getLogger(StationServiceImpl.class);
    /**
     * 跳转都showPrice.jsp界面
     */
	private final String SHOWPRICE = "showPrice";
	
	/**
     * 跳转都getPrice.jsp界面
     */
	private final String GETPRICE = "getPrice";
	
	@Autowired
	private IStationService iStationService;
	/**
	 * 跳转到查询车票价格界面
	 * @return
	 */
	@RequestMapping("/showPrice")
	public String showPrice(){
		
		return SHOWPRICE;
	}
	
	@RequestMapping("/getPrice")
	public String getPrice(String trainnum,String startStation,String endStation,HttpServletRequest request){
		/**
		 * 效验前端传入参数是否为空
		 */
		if(StringUtils.isEmpty(trainnum)){
			//打印日志
			LOGER.error("getPrice()  trainnum is null");
			
			request.setAttribute("error", "车次不能为空");
			return SHOWPRICE;
		}
		if(StringUtils.isEmpty(startStation)){
			//打印日志
			LOGER.error("getPrice()  start is null");
			request.setAttribute("error", "起始站不能为空");
			return SHOWPRICE;
		}
		if(StringUtils.isEmpty(endStation)){
			//打印日志
			LOGER.error("getPrice()  end is null");
			request.setAttribute("error", "终点站不能为空");
			return SHOWPRICE;
		}
		Double price = iStationService.startToEndProce(trainnum, startStation, endStation);
        //如果没有找到数据的话，或者为0
		if(price==null || price==0){
        	return SHOWPRICE;
        }
		request.setAttribute("startToEndProce", price);
		request.setAttribute("trainnum", trainnum);
		request.setAttribute("startStation", startStation);
		request.setAttribute("endStation", endStation);
		return GETPRICE;
	}
	
}
