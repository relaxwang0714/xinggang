package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.LingliYouyue;
import com.example.xinggang.Entity.LingliYouyueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LingliYouyueMapper {
    long countByExample(LingliYouyueExample example);

    int deleteByExample(LingliYouyueExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(LingliYouyue record);

    int insertSelective(LingliYouyue record);

    List<LingliYouyue> selectByExample(LingliYouyueExample example);

    LingliYouyue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LingliYouyue record, @Param("example") LingliYouyueExample example);

    int updateByExample(@Param("record") LingliYouyue record, @Param("example") LingliYouyueExample example);

    int updateByPrimaryKeySelective(LingliYouyue record);

    int updateByPrimaryKey(LingliYouyue record);
}