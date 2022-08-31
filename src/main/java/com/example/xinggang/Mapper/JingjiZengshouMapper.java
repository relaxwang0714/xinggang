package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.JingjiZengshou;
import com.example.xinggang.Entity.JingjiZengshouExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JingjiZengshouMapper {
    long countByExample(JingjiZengshouExample example);

    int deleteByExample(JingjiZengshouExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(JingjiZengshou record);

    int insertSelective(JingjiZengshou record);

    List<JingjiZengshou> selectByExample(JingjiZengshouExample example);

    JingjiZengshou selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JingjiZengshou record, @Param("example") JingjiZengshouExample example);

    int updateByExample(@Param("record") JingjiZengshou record, @Param("example") JingjiZengshouExample example);

    int updateByPrimaryKeySelective(JingjiZengshou record);

    int updateByPrimaryKey(JingjiZengshou record);
}