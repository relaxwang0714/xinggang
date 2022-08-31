package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.Overview;
import com.example.xinggang.Entity.OverviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OverviewMapper {
    long countByExample(OverviewExample example);

    int deleteByExample(OverviewExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(Overview record);

    int insertSelective(Overview record);

    List<Overview> selectByExample(OverviewExample example);

    Overview selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Overview record, @Param("example") OverviewExample example);

    int updateByExample(@Param("record") Overview record, @Param("example") OverviewExample example);

    int updateByPrimaryKeySelective(Overview record);

    int updateByPrimaryKey(Overview record);
}