package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.Dangyuan;
import com.example.xinggang.Entity.DangyuanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DangyuanMapper {
    long countByExample(DangyuanExample example);

    int deleteByExample(DangyuanExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(Dangyuan record);

    int insertSelective(Dangyuan record);

    List<Dangyuan> selectByExample(DangyuanExample example);

    Dangyuan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dangyuan record, @Param("example") DangyuanExample example);

    int updateByExample(@Param("record") Dangyuan record, @Param("example") DangyuanExample example);

    int updateByPrimaryKeySelective(Dangyuan record);

    int updateByPrimaryKey(Dangyuan record);
}