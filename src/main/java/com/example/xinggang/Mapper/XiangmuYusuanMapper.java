package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.XiangmuYusuan;
import com.example.xinggang.Entity.XiangmuYusuanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XiangmuYusuanMapper {
    long countByExample(XiangmuYusuanExample example);

    int deleteByExample(XiangmuYusuanExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(XiangmuYusuan record);

    int insertSelective(XiangmuYusuan record);

    List<XiangmuYusuan> selectByExample(XiangmuYusuanExample example);

    XiangmuYusuan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") XiangmuYusuan record, @Param("example") XiangmuYusuanExample example);

    int updateByExample(@Param("record") XiangmuYusuan record, @Param("example") XiangmuYusuanExample example);

    int updateByPrimaryKeySelective(XiangmuYusuan record);

    int updateByPrimaryKey(XiangmuYusuan record);
}