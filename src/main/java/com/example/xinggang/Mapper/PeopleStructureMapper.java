package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.PeopleStructure;
import com.example.xinggang.Entity.PeopleStructureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PeopleStructureMapper {
    long countByExample(PeopleStructureExample example);

    int deleteByExample(PeopleStructureExample example);

    int deleteByPrimaryKey(Long id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(PeopleStructure record);

    int insertSelective(PeopleStructure record);

    List<PeopleStructure> selectByExample(PeopleStructureExample example);

    PeopleStructure selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PeopleStructure record, @Param("example") PeopleStructureExample example);

    int updateByExample(@Param("record") PeopleStructure record, @Param("example") PeopleStructureExample example);

    int updateByPrimaryKeySelective(PeopleStructure record);

    int updateByPrimaryKey(PeopleStructure record);
}