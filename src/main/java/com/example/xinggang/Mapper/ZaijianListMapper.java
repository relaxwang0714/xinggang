package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.ZaijianList;
import com.example.xinggang.Entity.ZaijianListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZaijianListMapper {
    long countByExample(ZaijianListExample example);

    int deleteByExample(ZaijianListExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(ZaijianList record);

    int insertSelective(ZaijianList record);

    List<ZaijianList> selectByExample(ZaijianListExample example);

    ZaijianList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZaijianList record, @Param("example") ZaijianListExample example);

    int updateByExample(@Param("record") ZaijianList record, @Param("example") ZaijianListExample example);

    int updateByPrimaryKeySelective(ZaijianList record);

    int updateByPrimaryKey(ZaijianList record);
}