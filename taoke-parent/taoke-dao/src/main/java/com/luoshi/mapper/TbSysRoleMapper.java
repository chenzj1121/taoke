package com.luoshi.mapper;

import com.luoshi.pojo.TbSysRole;
import com.luoshi.pojo.TbSysRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSysRoleMapper {
    int countByExample(TbSysRoleExample example);

    int deleteByExample(TbSysRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSysRole record);

    int insertSelective(TbSysRole record);

    List<TbSysRole> selectByExample(TbSysRoleExample example);

    TbSysRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbSysRole record, @Param("example") TbSysRoleExample example);

    int updateByExample(@Param("record") TbSysRole record, @Param("example") TbSysRoleExample example);

    int updateByPrimaryKeySelective(TbSysRole record);

    int updateByPrimaryKey(TbSysRole record);
}