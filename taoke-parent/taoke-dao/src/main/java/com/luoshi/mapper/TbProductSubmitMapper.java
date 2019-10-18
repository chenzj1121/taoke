package com.luoshi.mapper;

import com.luoshi.pojo.TbProductSubmit;
import com.luoshi.pojo.TbProductSubmitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProductSubmitMapper {
    int countByExample(TbProductSubmitExample example);

    int deleteByExample(TbProductSubmitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbProductSubmit record);

    int insertSelective(TbProductSubmit record);

    List<TbProductSubmit> selectByExample(TbProductSubmitExample example);

    TbProductSubmit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbProductSubmit record, @Param("example") TbProductSubmitExample example);

    int updateByExample(@Param("record") TbProductSubmit record, @Param("example") TbProductSubmitExample example);

    int updateByPrimaryKeySelective(TbProductSubmit record);

    int updateByPrimaryKey(TbProductSubmit record);
}