package com.ssm.dao;

import com.ssm.model.Passinfo;
import com.ssm.model.PassinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PassinfoMapper {
    int countByExample(PassinfoExample example);

    int deleteByExample(PassinfoExample example);

    int deleteByPrimaryKey(Integer passId);

    int insert(Passinfo record);

    int insertSelective(Passinfo record);

    List<Passinfo> selectByExample(PassinfoExample example);

    Passinfo selectByPrimaryKey(Integer passId);

    int updateByExampleSelective(@Param("record") Passinfo record, @Param("example") PassinfoExample example);

    int updateByExample(@Param("record") Passinfo record, @Param("example") PassinfoExample example);

    int updateByPrimaryKeySelective(Passinfo record);

    int updateByPrimaryKey(Passinfo record);
}