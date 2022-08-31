package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.WanggeXinxi;
import com.example.xinggang.Entity.WanggeXinxiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WanggeXinxiMapper {
    long countByExample(WanggeXinxiExample example);

    int deleteByExample(WanggeXinxiExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(WanggeXinxi record);

    int insertSelective(WanggeXinxi record);

    List<WanggeXinxi> selectByExample(WanggeXinxiExample example);

    WanggeXinxi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WanggeXinxi record, @Param("example") WanggeXinxiExample example);

    int updateByExample(@Param("record") WanggeXinxi record, @Param("example") WanggeXinxiExample example);

    int updateByPrimaryKeySelective(WanggeXinxi record);

    int updateByPrimaryKey(WanggeXinxi record);
}