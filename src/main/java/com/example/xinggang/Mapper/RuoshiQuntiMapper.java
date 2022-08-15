package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.RuoshiQunti;
import com.example.xinggang.Entity.RuoshiQuntiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RuoshiQuntiMapper {
    long countByExample(RuoshiQuntiExample example);

    int deleteByExample(RuoshiQuntiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RuoshiQunti record);

    int insertSelective(RuoshiQunti record);

    List<RuoshiQunti> selectByExample(RuoshiQuntiExample example);

    RuoshiQunti selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RuoshiQunti record, @Param("example") RuoshiQuntiExample example);

    int updateByExample(@Param("record") RuoshiQunti record, @Param("example") RuoshiQuntiExample example);

    int updateByPrimaryKeySelective(RuoshiQunti record);

    int updateByPrimaryKey(RuoshiQunti record);
}