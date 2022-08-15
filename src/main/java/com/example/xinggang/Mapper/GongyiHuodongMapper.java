package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.GongyiHuodong;
import com.example.xinggang.Entity.GongyiHuodongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GongyiHuodongMapper {
    long countByExample(GongyiHuodongExample example);

    int deleteByExample(GongyiHuodongExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GongyiHuodong record);

    int insertSelective(GongyiHuodong record);

    List<GongyiHuodong> selectByExample(GongyiHuodongExample example);

    GongyiHuodong selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GongyiHuodong record, @Param("example") GongyiHuodongExample example);

    int updateByExample(@Param("record") GongyiHuodong record, @Param("example") GongyiHuodongExample example);

    int updateByPrimaryKeySelective(GongyiHuodong record);

    int updateByPrimaryKey(GongyiHuodong record);
}