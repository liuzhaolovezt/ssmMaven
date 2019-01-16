package com.ssm.dao;

import com.ssm.model.Expenseclass;
import com.ssm.model.ExpenseclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExpenseclassMapper {
    int countByExample(ExpenseclassExample example);

    int deleteByExample(ExpenseclassExample example);

    int deleteByPrimaryKey(Integer exclassId);

    int insert(Expenseclass record);

    int insertSelective(Expenseclass record);

    List<Expenseclass> selectByExample(ExpenseclassExample example);

    Expenseclass selectByPrimaryKey(Integer exclassId);

    int updateByExampleSelective(@Param("record") Expenseclass record, @Param("example") ExpenseclassExample example);

    int updateByExample(@Param("record") Expenseclass record, @Param("example") ExpenseclassExample example);

    int updateByPrimaryKeySelective(Expenseclass record);

    int updateByPrimaryKey(Expenseclass record);
}