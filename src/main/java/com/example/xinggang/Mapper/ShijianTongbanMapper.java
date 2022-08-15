package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.ShijianTongban;
import com.example.xinggang.Entity.ShijianTongbanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShijianTongbanMapper {
    long countByExample(ShijianTongbanExample example);

    int deleteByExample(ShijianTongbanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShijianTongban record);

    int insertSelective(ShijianTongban record);

    List<ShijianTongban> selectByExample(ShijianTongbanExample example);

    ShijianTongban selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShijianTongban record, @Param("example") ShijianTongbanExample example);

    int updateByExample(@Param("record") ShijianTongban record, @Param("example") ShijianTongbanExample example);

    int updateByPrimaryKeySelective(ShijianTongban record);

    int updateByPrimaryKey(ShijianTongban record);
}