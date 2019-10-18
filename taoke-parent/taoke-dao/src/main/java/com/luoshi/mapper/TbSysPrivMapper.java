package com.luoshi.mapper;

import com.luoshi.pojo.TbSysPriv;
import com.luoshi.pojo.TbSysPrivExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSysPrivMapper {
    int countByExample(TbSysPrivExample example);

    int deleteByExample(TbSysPrivExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSysPriv record);

    int insertSelective(TbSysPriv record);

    List<TbSysPriv> selectByExample(TbSysPrivExample example);

    TbSysPriv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbSysPriv record, @Param("example") TbSysPrivExample example);

    int updateByExample(@Param("record") TbSysPriv record, @Param("example") TbSysPrivExample example);

    int updateByPrimaryKeySelective(TbSysPriv record);

    int updateByPrimaryKey(TbSysPriv record);
}