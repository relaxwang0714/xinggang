package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.LingliZhongxin;
import com.example.xinggang.Entity.LingliZhongxinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LingliZhongxinMapper {
    long countByExample(LingliZhongxinExample example);

    int deleteByExample(LingliZhongxinExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(LingliZhongxin record);

    int insertSelective(LingliZhongxin record);

    List<LingliZhongxin> selectByExample(LingliZhongxinExample example);

    LingliZhongxin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LingliZhongxin record, @Param("example") LingliZhongxinExample example);

    int updateByExample(@Param("record") LingliZhongxin record, @Param("example") LingliZhongxinExample example);

    int updateByPrimaryKeySelective(LingliZhongxin record);

    int updateByPrimaryKey(LingliZhongxin record);
}