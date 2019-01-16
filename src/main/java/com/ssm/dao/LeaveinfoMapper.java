package com.ssm.dao;

import com.ssm.model.Leaveinfo;
import com.ssm.model.LeaveinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeaveinfoMapper {
    int countByExample(LeaveinfoExample example);

    int deleteByExample(LeaveinfoExample example);

    int deleteByPrimaryKey(Integer leaveId);

    int insert(Leaveinfo record);

    int insertSelective(Leaveinfo record);

    List<Leaveinfo> selectByExample(LeaveinfoExample example);

    Leaveinfo selectByPrimaryKey(Integer leaveId);

    int updateByExampleSelective(@Param("record") Leaveinfo record, @Param("example") LeaveinfoExample example);

    int updateByExample(@Param("record") Leaveinfo record, @Param("example") LeaveinfoExample example);

    int updateByPrimaryKeySelective(Leaveinfo record);

    int updateByPrimaryKey(Leaveinfo record);
}