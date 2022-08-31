package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.YetaiFenbu;
import com.example.xinggang.Entity.YetaiFenbuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YetaiFenbuMapper {
    long countByExample(YetaiFenbuExample example);

    int deleteByExample(YetaiFenbuExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(YetaiFenbu record);

    int insertSelective(YetaiFenbu record);

    List<YetaiFenbu> selectByExample(YetaiFenbuExample example);

    YetaiFenbu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YetaiFenbu record, @Param("example") YetaiFenbuExample example);

    int updateByExample(@Param("record") YetaiFenbu record, @Param("example") YetaiFenbuExample example);

    int updateByPrimaryKeySelective(YetaiFenbu record);

    int updateByPrimaryKey(YetaiFenbu record);
}