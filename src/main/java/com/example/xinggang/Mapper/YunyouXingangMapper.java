package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.YunyouXingang;
import com.example.xinggang.Entity.YunyouXingangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YunyouXingangMapper {
    long countByExample(YunyouXingangExample example);

    int deleteByExample(YunyouXingangExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(YunyouXingang record);

    int insertSelective(YunyouXingang record);

    List<YunyouXingang> selectByExample(YunyouXingangExample example);

    YunyouXingang selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YunyouXingang record, @Param("example") YunyouXingangExample example);

    int updateByExample(@Param("record") YunyouXingang record, @Param("example") YunyouXingangExample example);

    int updateByPrimaryKeySelective(YunyouXingang record);

    int updateByPrimaryKey(YunyouXingang record);
}