package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.ZhihuiDangjian;
import com.example.xinggang.Entity.ZhihuiDangjianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZhihuiDangjianMapper {
    long countByExample(ZhihuiDangjianExample example);

    int deleteByExample(ZhihuiDangjianExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZhihuiDangjian record);

    int insertSelective(ZhihuiDangjian record);

    List<ZhihuiDangjian> selectByExample(ZhihuiDangjianExample example);

    ZhihuiDangjian selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZhihuiDangjian record, @Param("example") ZhihuiDangjianExample example);

    int updateByExample(@Param("record") ZhihuiDangjian record, @Param("example") ZhihuiDangjianExample example);

    int updateByPrimaryKeySelective(ZhihuiDangjian record);

    int updateByPrimaryKey(ZhihuiDangjian record);
}