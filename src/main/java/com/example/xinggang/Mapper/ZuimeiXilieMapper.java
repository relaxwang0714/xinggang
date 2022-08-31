package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.ZuimeiXilie;
import com.example.xinggang.Entity.ZuimeiXilieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZuimeiXilieMapper {
    long countByExample(ZuimeiXilieExample example);

    int deleteByExample(ZuimeiXilieExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(ZuimeiXilie record);

    int insertSelective(ZuimeiXilie record);

    List<ZuimeiXilie> selectByExample(ZuimeiXilieExample example);

    ZuimeiXilie selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZuimeiXilie record, @Param("example") ZuimeiXilieExample example);

    int updateByExample(@Param("record") ZuimeiXilie record, @Param("example") ZuimeiXilieExample example);

    int updateByPrimaryKeySelective(ZuimeiXilie record);

    int updateByPrimaryKey(ZuimeiXilie record);
}