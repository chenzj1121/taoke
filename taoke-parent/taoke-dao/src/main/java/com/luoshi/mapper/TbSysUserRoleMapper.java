package com.luoshi.mapper;

import com.luoshi.pojo.TbSysUserRole;
import com.luoshi.pojo.TbSysUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSysUserRoleMapper {
    int countByExample(TbSysUserRoleExample example);

    int deleteByExample(TbSysUserRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSysUserRole record);

    int insertSelective(TbSysUserRole record);

    List<TbSysUserRole> selectByExample(TbSysUserRoleExample example);

    TbSysUserRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbSysUserRole record, @Param("example") TbSysUserRoleExample example);

    int updateByExample(@Param("record") TbSysUserRole record, @Param("example") TbSysUserRoleExample example);

    int updateByPrimaryKeySelective(TbSysUserRole record);

    int updateByPrimaryKey(TbSysUserRole record);
}