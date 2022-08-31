package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.JianchaLianluozhan;
import com.example.xinggang.Entity.JianchaLianluozhanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JianchaLianluozhanMapper {
    long countByExample(JianchaLianluozhanExample example);

    int deleteByExample(JianchaLianluozhanExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(JianchaLianluozhan record);

    int insertSelective(JianchaLianluozhan record);

    List<JianchaLianluozhan> selectByExample(JianchaLianluozhanExample example);

    JianchaLianluozhan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JianchaLianluozhan record, @Param("example") JianchaLianluozhanExample example);

    int updateByExample(@Param("record") JianchaLianluozhan record, @Param("example") JianchaLianluozhanExample example);

    int updateByPrimaryKeySelective(JianchaLianluozhan record);

    int updateByPrimaryKey(JianchaLianluozhan record);
}