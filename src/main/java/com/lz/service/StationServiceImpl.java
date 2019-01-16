package com.lz.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lz.dao.StationMapper;
import com.lz.model.Station;
@Service("stationService")
public class StationServiceImpl implements IStationService {

	/**
	 * 点击变量名称ctrl+shift+x
	 */
	private static Logger LOGER= Logger.getLogger(StationServiceImpl.class);
	@Autowired
	private StationMapper stationMapper;
	
	public Double startToEndProce(String trainnum, String startStation, String endStation) {
		LOGER.info("startToEndProce() trainnum = "+trainnum +",startStation = "+startStation+"endStation="+endStation);
		
		Double resultPrice = null;
		//出发站信息
		Station stationStartResult = findByStation(trainnum,startStation);
		if(stationStartResult == null)
		{
			//打印日志
			LOGER.error("startToEndProce()  stationStartResult is null");
			return resultPrice;
		}
		//目的站信息
		Station stationEndResult = findByStation(trainnum,endStation);
		if(stationEndResult == null)
		{
			//打印日志
			LOGER.error("startToEndProce()  stationEndResult is null");
			return resultPrice;
		}
		
		resultPrice = stationEndResult.getStatiprice()-stationStartResult.getStatiprice();
		LOGER.info("startToEndProce() resultPrice = "+resultPrice);
		return resultPrice;
	}
	
	/**
	 * 通过车次和地点返回车站信息对象
	 * @param trainnum
	 * @param startStation
	 * @return
	 */
	private Station findByStation(String trainnum, String startStation){
		Station station2 = new Station();
		station2.setTrainnum(trainnum);
		station2.setStation(startStation);
		return stationMapper.findByStation(station2);
	}
}
