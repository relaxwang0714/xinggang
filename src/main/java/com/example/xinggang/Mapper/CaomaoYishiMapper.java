package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.CaomaoYishi;
import com.example.xinggang.Entity.CaomaoYishiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CaomaoYishiMapper {
    long countByExample(CaomaoYishiExample example);

    int deleteByExample(CaomaoYishiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CaomaoYishi record);

    int insertSelective(CaomaoYishi record);

    List<CaomaoYishi> selectByExample(CaomaoYishiExample example);

    CaomaoYishi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CaomaoYishi record, @Param("example") CaomaoYishiExample example);

    int updateByExample(@Param("record") CaomaoYishi record, @Param("example") CaomaoYishiExample example);

    int updateByPrimaryKeySelective(CaomaoYishi record);

    int updateByPrimaryKey(CaomaoYishi record);
}