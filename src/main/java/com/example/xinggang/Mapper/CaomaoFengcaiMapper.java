package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.CaomaoFengcai;
import com.example.xinggang.Entity.CaomaoFengcaiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaomaoFengcaiMapper {
    long countByExample(CaomaoFengcaiExample example);

    int deleteByExample(CaomaoFengcaiExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(CaomaoFengcai record);

    int insertSelective(CaomaoFengcai record);

    List<CaomaoFengcai> selectByExample(CaomaoFengcaiExample example);

    CaomaoFengcai selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CaomaoFengcai record, @Param("example") CaomaoFengcaiExample example);

    int updateByExample(@Param("record") CaomaoFengcai record, @Param("example") CaomaoFengcaiExample example);

    int updateByPrimaryKeySelective(CaomaoFengcai record);

    int updateByPrimaryKey(CaomaoFengcai record);
}