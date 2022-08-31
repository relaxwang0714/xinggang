package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.Lianxihu;
import com.example.xinggang.Entity.LianxihuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LianxihuMapper {
    long countByExample(LianxihuExample example);

    int deleteByExample(LianxihuExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(Lianxihu record);

    int insertSelective(Lianxihu record);

    List<Lianxihu> selectByExample(LianxihuExample example);

    Lianxihu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Lianxihu record, @Param("example") LianxihuExample example);

    int updateByExample(@Param("record") Lianxihu record, @Param("example") LianxihuExample example);

    int updateByPrimaryKeySelective(Lianxihu record);

    int updateByPrimaryKey(Lianxihu record);
}