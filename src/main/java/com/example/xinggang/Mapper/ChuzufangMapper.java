package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.Chuzufang;
import com.example.xinggang.Entity.ChuzufangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChuzufangMapper {
    long countByExample(ChuzufangExample example);

    int deleteByExample(ChuzufangExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Chuzufang record);

    int insertSelective(Chuzufang record);

    List<Chuzufang> selectByExample(ChuzufangExample example);

    Chuzufang selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Chuzufang record, @Param("example") ChuzufangExample example);

    int updateByExample(@Param("record") Chuzufang record, @Param("example") ChuzufangExample example);

    int updateByPrimaryKeySelective(Chuzufang record);

    int updateByPrimaryKey(Chuzufang record);
}