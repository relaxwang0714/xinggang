package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.GongyiGuanggao;
import com.example.xinggang.Entity.GongyiGuanggaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GongyiGuanggaoMapper {
    long countByExample(GongyiGuanggaoExample example);

    int deleteByExample(GongyiGuanggaoExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(GongyiGuanggao record);

    int insertSelective(GongyiGuanggao record);

    List<GongyiGuanggao> selectByExample(GongyiGuanggaoExample example);

    GongyiGuanggao selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GongyiGuanggao record, @Param("example") GongyiGuanggaoExample example);

    int updateByExample(@Param("record") GongyiGuanggao record, @Param("example") GongyiGuanggaoExample example);

    int updateByPrimaryKeySelective(GongyiGuanggao record);

    int updateByPrimaryKey(GongyiGuanggao record);
}