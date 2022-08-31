package com.example.xinggang.Mapper;

import com.example.xinggang.Entity.Dianpu;
import com.example.xinggang.Entity.DianpuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DianpuMapper {
    long countByExample(DianpuExample example);

    int deleteByExample(DianpuExample example);

    int deleteByPrimaryKey(Integer id);

    int logicdeleteByPrimaryKey(Integer id);

    int insert(Dianpu record);

    int insertSelective(Dianpu record);

    List<Dianpu> selectByExampleWithBLOBs(DianpuExample example);

    List<Dianpu> selectByExample(DianpuExample example);

    Dianpu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dianpu record, @Param("example") DianpuExample example);

    int updateByExampleWithBLOBs(@Param("record") Dianpu record, @Param("example") DianpuExample example);

    int updateByExample(@Param("record") Dianpu record, @Param("example") DianpuExample example);

    int updateByPrimaryKeySelective(Dianpu record);

    int updateByPrimaryKeyWithBLOBs(Dianpu record);

    int updateByPrimaryKey(Dianpu record);
}