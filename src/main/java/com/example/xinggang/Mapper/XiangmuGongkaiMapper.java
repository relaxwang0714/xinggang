package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.XiangmuGongkai;
import com.example.xinggang.Entity.XiangmuGongkaiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XiangmuGongkaiMapper {
    long countByExample(XiangmuGongkaiExample example);

    int deleteByExample(XiangmuGongkaiExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(XiangmuGongkai record);

    int insertSelective(XiangmuGongkai record);

    List<XiangmuGongkai> selectByExample(XiangmuGongkaiExample example);

    XiangmuGongkai selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XiangmuGongkai record, @Param("example") XiangmuGongkaiExample example);

    int updateByExample(@Param("record") XiangmuGongkai record, @Param("example") XiangmuGongkaiExample example);

    int updateByPrimaryKeySelective(XiangmuGongkai record);

    int updateByPrimaryKey(XiangmuGongkai record);
}