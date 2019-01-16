package com.lz.service;

public interface IStationService {

	/**
	 * 
	 * @param trainnum 车次
	 * @param startStation 出发地
	 * @param endStation 目的地
	 * 计算出发地到目的地的价格
	 * @return
	 */
	public Double startToEndProce(String trainnum,String startStation,String endStation);
	
}
