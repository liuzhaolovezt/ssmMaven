package com.ssm.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.TUserMapper;

@Service("infoService")
public class InfoServiceImpl implements IInfoService {
	private static Logger LOGER= Logger.getLogger(InfoServiceImpl.class);
	
	@Autowired
	private TUserMapper tUserMapper;
	
}
