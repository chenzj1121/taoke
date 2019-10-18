package com.luoshi.mapper;

import com.luoshi.pojo.TbUserWorkTargetMonth;
import com.luoshi.pojo.TbUserWorkTargetMonthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserWorkTargetMonthMapper {
    int countByExample(TbUserWorkTargetMonthExample example);

    int deleteByExample(TbUserWorkTargetMonthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUserWorkTargetMonth record);

    int insertSelective(TbUserWorkTargetMonth record);

    List<TbUserWorkTargetMonth> selectByExample(TbUserWorkTargetMonthExample example);

    TbUserWorkTargetMonth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUserWorkTargetMonth record, @Param("example") TbUserWorkTargetMonthExample example);

    int updateByExample(@Param("record") TbUserWorkTargetMonth record, @Param("example") TbUserWorkTargetMonthExample example);

    int updateByPrimaryKeySelective(TbUserWorkTargetMonth record);

    int updateByPrimaryKey(TbUserWorkTargetMonth record);
}