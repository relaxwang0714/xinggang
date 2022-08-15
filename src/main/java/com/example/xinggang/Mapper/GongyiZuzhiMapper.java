package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.GongyiZuzhi;
import com.example.xinggang.Entity.GongyiZuzhiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GongyiZuzhiMapper {
    long countByExample(GongyiZuzhiExample example);

    int deleteByExample(GongyiZuzhiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GongyiZuzhi record);

    int insertSelective(GongyiZuzhi record);

    List<GongyiZuzhi> selectByExample(GongyiZuzhiExample example);

    GongyiZuzhi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GongyiZuzhi record, @Param("example") GongyiZuzhiExample example);

    int updateByExample(@Param("record") GongyiZuzhi record, @Param("example") GongyiZuzhiExample example);

    int updateByPrimaryKeySelective(GongyiZuzhi record);

    int updateByPrimaryKey(GongyiZuzhi record);
}