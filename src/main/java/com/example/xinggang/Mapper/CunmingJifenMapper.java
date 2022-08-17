package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.CunmingJifen;
import com.example.xinggang.Entity.CunmingJifenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CunmingJifenMapper {
    long countByExample(CunmingJifenExample example);

    int deleteByExample(CunmingJifenExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CunmingJifen record);

    int insertSelective(CunmingJifen record);

    List<CunmingJifen> selectByExample(CunmingJifenExample example);

    CunmingJifen selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CunmingJifen record, @Param("example") CunmingJifenExample example);

    int updateByExample(@Param("record") CunmingJifen record, @Param("example") CunmingJifenExample example);

    int updateByPrimaryKeySelective(CunmingJifen record);

    int updateByPrimaryKey(CunmingJifen record);
}