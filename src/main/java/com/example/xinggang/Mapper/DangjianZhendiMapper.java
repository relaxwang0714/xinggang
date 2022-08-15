package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.DangjianZhendi;
import com.example.xinggang.Entity.DangjianZhendiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DangjianZhendiMapper {
    long countByExample(DangjianZhendiExample example);

    int deleteByExample(DangjianZhendiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DangjianZhendi record);

    int insertSelective(DangjianZhendi record);

    List<DangjianZhendi> selectByExample(DangjianZhendiExample example);

    DangjianZhendi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DangjianZhendi record, @Param("example") DangjianZhendiExample example);

    int updateByExample(@Param("record") DangjianZhendi record, @Param("example") DangjianZhendiExample example);

    int updateByPrimaryKeySelective(DangjianZhendi record);

    int updateByPrimaryKey(DangjianZhendi record);
}