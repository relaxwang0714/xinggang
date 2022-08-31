package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.LaonianXiehui;
import com.example.xinggang.Entity.LaonianXiehuiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LaonianXiehuiMapper {
    long countByExample(LaonianXiehuiExample example);

    int deleteByExample(LaonianXiehuiExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(LaonianXiehui record);

    int insertSelective(LaonianXiehui record);

    List<LaonianXiehui> selectByExample(LaonianXiehuiExample example);

    LaonianXiehui selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LaonianXiehui record, @Param("example") LaonianXiehuiExample example);

    int updateByExample(@Param("record") LaonianXiehui record, @Param("example") LaonianXiehuiExample example);

    int updateByPrimaryKeySelective(LaonianXiehui record);

    int updateByPrimaryKey(LaonianXiehui record);
}