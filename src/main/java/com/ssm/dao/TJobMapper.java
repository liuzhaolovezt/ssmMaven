package com.ssm.dao;

import com.ssm.model.TJob;
import com.ssm.model.TJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TJobMapper {
    int countByExample(TJobExample example);

    int deleteByExample(TJobExample example);

    int deleteByPrimaryKey(Integer jobId);

    int insert(TJob record);

    int insertSelective(TJob record);

    List<TJob> selectByExample(TJobExample example);

    TJob selectByPrimaryKey(Integer jobId);

    int updateByExampleSelective(@Param("record") TJob record, @Param("example") TJobExample example);

    int updateByExample(@Param("record") TJob record, @Param("example") TJobExample example);

    int updateByPrimaryKeySelective(TJob record);

    int updateByPrimaryKey(TJob record);
}