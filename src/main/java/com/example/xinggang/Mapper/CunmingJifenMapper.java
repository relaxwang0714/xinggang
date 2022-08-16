package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.cunmingJifen;
import com.example.xinggang.Entity.cunmingJifenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CunmingJifenMapper {
    long countByExample(cunmingJifenExample example);

    int deleteByExample(cunmingJifenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(cunmingJifen record);

    int insertSelective(cunmingJifen record);

    List<cunmingJifen> selectByExample(cunmingJifenExample example);

    cunmingJifen selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") cunmingJifen record, @Param("example") cunmingJifenExample example);

    int updateByExample(@Param("record") cunmingJifen record, @Param("example") cunmingJifenExample example);

    int updateByPrimaryKeySelective(cunmingJifen record);

    int updateByPrimaryKey(cunmingJifen record);
}