package com.luoshi.mapper;

import com.luoshi.pojo.TbCoop;
import com.luoshi.pojo.TbCoopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCoopMapper {
    int countByExample(TbCoopExample example);

    int deleteByExample(TbCoopExample example);

    int deleteByPrimaryKey(Integer coopId);

    int insert(TbCoop record);

    int insertSelective(TbCoop record);

    List<TbCoop> selectByExample(TbCoopExample example);

    TbCoop selectByPrimaryKey(Integer coopId);

    int updateByExampleSelective(@Param("record") TbCoop record, @Param("example") TbCoopExample example);

    int updateByExample(@Param("record") TbCoop record, @Param("example") TbCoopExample example);

    int updateByPrimaryKeySelective(TbCoop record);

    int updateByPrimaryKey(TbCoop record);
}