package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.XiangtuMinsu;
import com.example.xinggang.Entity.XiangtuMinsuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XiangtuMinsuMapper {
    long countByExample(XiangtuMinsuExample example);

    int deleteByExample(XiangtuMinsuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(XiangtuMinsu record);

    int insertSelective(XiangtuMinsu record);

    List<XiangtuMinsu> selectByExample(XiangtuMinsuExample example);

    XiangtuMinsu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XiangtuMinsu record, @Param("example") XiangtuMinsuExample example);

    int updateByExample(@Param("record") XiangtuMinsu record, @Param("example") XiangtuMinsuExample example);

    int updateByPrimaryKeySelective(XiangtuMinsu record);

    int updateByPrimaryKey(XiangtuMinsu record);
}