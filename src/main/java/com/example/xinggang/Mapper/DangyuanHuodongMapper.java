package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.DangyuanHuodong;
import com.example.xinggang.Entity.DangyuanHuodongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DangyuanHuodongMapper {
    long countByExample(DangyuanHuodongExample example);

    int deleteByExample(DangyuanHuodongExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(DangyuanHuodong record);

    int insertSelective(DangyuanHuodong record);

    List<DangyuanHuodong> selectByExample(DangyuanHuodongExample example);

    DangyuanHuodong selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DangyuanHuodong record, @Param("example") DangyuanHuodongExample example);

    int updateByExample(@Param("record") DangyuanHuodong record, @Param("example") DangyuanHuodongExample example);

    int updateByPrimaryKeySelective(DangyuanHuodong record);

    int updateByPrimaryKey(DangyuanHuodong record);
}