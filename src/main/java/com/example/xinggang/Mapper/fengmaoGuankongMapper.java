package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.fengmaoGuankong;
import com.example.xinggang.Entity.fengmaoGuankongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface fengmaoGuankongMapper {
    long countByExample(fengmaoGuankongExample example);

    int deleteByExample(fengmaoGuankongExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(fengmaoGuankong record);

    int insertSelective(fengmaoGuankong record);

    List<fengmaoGuankong> selectByExampleWithBLOBs(fengmaoGuankongExample example);

    List<fengmaoGuankong> selectByExample(fengmaoGuankongExample example);

    fengmaoGuankong selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") fengmaoGuankong record, @Param("example") fengmaoGuankongExample example);

    int updateByExampleWithBLOBs(@Param("record") fengmaoGuankong record, @Param("example") fengmaoGuankongExample example);

    int updateByExample(@Param("record") fengmaoGuankong record, @Param("example") fengmaoGuankongExample example);

    int updateByPrimaryKeySelective(fengmaoGuankong record);

    int updateByPrimaryKeyWithBLOBs(fengmaoGuankong record);

    int updateByPrimaryKey(fengmaoGuankong record);
}