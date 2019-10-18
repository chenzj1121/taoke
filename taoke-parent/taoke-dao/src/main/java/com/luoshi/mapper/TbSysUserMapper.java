package com.luoshi.mapper;

import com.luoshi.pojo.TbSysUser;
import com.luoshi.pojo.TbSysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSysUserMapper {
    int countByExample(TbSysUserExample example);

    int deleteByExample(TbSysUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSysUser record);

    int insertSelective(TbSysUser record);

    List<TbSysUser> selectByExample(TbSysUserExample example);

    TbSysUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbSysUser record, @Param("example") TbSysUserExample example);

    int updateByExample(@Param("record") TbSysUser record, @Param("example") TbSysUserExample example);

    int updateByPrimaryKeySelective(TbSysUser record);

    int updateByPrimaryKey(TbSysUser record);
}