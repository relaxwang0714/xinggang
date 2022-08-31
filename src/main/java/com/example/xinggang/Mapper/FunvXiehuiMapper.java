package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.FunvXiehui;
import com.example.xinggang.Entity.FunvXiehuiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FunvXiehuiMapper {
    long countByExample(FunvXiehuiExample example);

    int deleteByExample(FunvXiehuiExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(FunvXiehui record);

    int insertSelective(FunvXiehui record);

    List<FunvXiehui> selectByExample(FunvXiehuiExample example);

    FunvXiehui selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FunvXiehui record, @Param("example") FunvXiehuiExample example);

    int updateByExample(@Param("record") FunvXiehui record, @Param("example") FunvXiehuiExample example);

    int updateByPrimaryKeySelective(FunvXiehui record);

    int updateByPrimaryKey(FunvXiehui record);
}