package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.PuhuiJinrong;
import com.example.xinggang.Entity.PuhuiJinrongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PuhuiJinrongMapper {
    long countByExample(PuhuiJinrongExample example);

    int deleteByExample(PuhuiJinrongExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(PuhuiJinrong record);

    int insertSelective(PuhuiJinrong record);

    List<PuhuiJinrong> selectByExample(PuhuiJinrongExample example);

    PuhuiJinrong selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PuhuiJinrong record, @Param("example") PuhuiJinrongExample example);

    int updateByExample(@Param("record") PuhuiJinrong record, @Param("example") PuhuiJinrongExample example);

    int updateByPrimaryKeySelective(PuhuiJinrong record);

    int updateByPrimaryKey(PuhuiJinrong record);
}