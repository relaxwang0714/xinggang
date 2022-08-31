package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.FengmaoGuankong;
import com.example.xinggang.Entity.FengmaoGuankongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FengmaoGuankongMapper {
    long countByExample(FengmaoGuankongExample example);

    int deleteByExample(FengmaoGuankongExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(FengmaoGuankong record);

    int insertSelective(FengmaoGuankong record);

    List<FengmaoGuankong> selectByExample(FengmaoGuankongExample example);

    FengmaoGuankong selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FengmaoGuankong record, @Param("example") FengmaoGuankongExample example);

    int updateByExample(@Param("record") FengmaoGuankong record, @Param("example") FengmaoGuankongExample example);

    int updateByPrimaryKeySelective(FengmaoGuankong record);

    int updateByPrimaryKey(FengmaoGuankong record);
}