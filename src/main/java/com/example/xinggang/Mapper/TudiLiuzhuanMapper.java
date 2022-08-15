package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.TudiLiuzhuan;
import com.example.xinggang.Entity.TudiLiuzhuanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TudiLiuzhuanMapper {
    long countByExample(TudiLiuzhuanExample example);

    int deleteByExample(TudiLiuzhuanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TudiLiuzhuan record);

    int insertSelective(TudiLiuzhuan record);

    List<TudiLiuzhuan> selectByExample(TudiLiuzhuanExample example);

    TudiLiuzhuan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TudiLiuzhuan record, @Param("example") TudiLiuzhuanExample example);

    int updateByExample(@Param("record") TudiLiuzhuan record, @Param("example") TudiLiuzhuanExample example);

    int updateByPrimaryKeySelective(TudiLiuzhuan record);

    int updateByPrimaryKey(TudiLiuzhuan record);
}