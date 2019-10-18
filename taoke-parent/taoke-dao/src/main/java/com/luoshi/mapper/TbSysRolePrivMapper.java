package com.luoshi.mapper;

import com.luoshi.pojo.TbSysRolePriv;
import com.luoshi.pojo.TbSysRolePrivExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSysRolePrivMapper {
    int countByExample(TbSysRolePrivExample example);

    int deleteByExample(TbSysRolePrivExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSysRolePriv record);

    int insertSelective(TbSysRolePriv record);

    List<TbSysRolePriv> selectByExample(TbSysRolePrivExample example);

    TbSysRolePriv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbSysRolePriv record, @Param("example") TbSysRolePrivExample example);

    int updateByExample(@Param("record") TbSysRolePriv record, @Param("example") TbSysRolePrivExample example);

    int updateByPrimaryKeySelective(TbSysRolePriv record);

    int updateByPrimaryKey(TbSysRolePriv record);
}