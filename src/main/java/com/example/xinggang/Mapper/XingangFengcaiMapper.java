package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.XingangFengcai;
import com.example.xinggang.Entity.XingangFengcaiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XingangFengcaiMapper {
    long countByExample(XingangFengcaiExample example);

    int deleteByExample(XingangFengcaiExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(XingangFengcai record);

    int insertSelective(XingangFengcai record);

    List<XingangFengcai> selectByExample(XingangFengcaiExample example);

    XingangFengcai selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XingangFengcai record, @Param("example") XingangFengcaiExample example);

    int updateByExample(@Param("record") XingangFengcai record, @Param("example") XingangFengcaiExample example);

    int updateByPrimaryKeySelective(XingangFengcai record);

    int updateByPrimaryKey(XingangFengcai record);
}