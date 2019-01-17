package com.ssm.dao;

import com.ssm.model.Notice;
import com.ssm.model.NoticeCustom;
import com.ssm.model.NoticeExample;
import com.ssm.model.NoticeQueryVo;
import com.ssm.util.PagerUtil;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface NoticeMapper {
    int countByExample(NoticeExample example);

    int deleteByExample(NoticeExample example);

    int deleteByPrimaryKey(Integer noticeId);

    int insert(Notice record);

    int insertSelective(Notice record);

    List<Notice> selectByExample(NoticeExample example);

    Notice selectByPrimaryKey(Integer noticeId);

    int updateByExampleSelective(@Param("record") Notice record, @Param("example") NoticeExample example);

    int updateByExample(@Param("record") Notice record, @Param("example") NoticeExample example);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);
    
    
    //20190117新加----------------------
    List<NoticeCustom> findNoticeList(NoticeQueryVo exampleVo);
    
    List<NoticeCustom> findNoticePage(Map map);
}