package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.JitiFangchan;
import com.example.xinggang.Entity.JitiFangchanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JitiFangchanMapper {
    long countByExample(JitiFangchanExample example);

    int deleteByExample(JitiFangchanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JitiFangchan record);

    int insertSelective(JitiFangchan record);

    List<JitiFangchan> selectByExample(JitiFangchanExample example);

    JitiFangchan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JitiFangchan record, @Param("example") JitiFangchanExample example);

    int updateByExample(@Param("record") JitiFangchan record, @Param("example") JitiFangchanExample example);

    int updateByPrimaryKeySelective(JitiFangchan record);

    int updateByPrimaryKey(JitiFangchan record);
}