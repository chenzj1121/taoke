package com.luoshi.mapper;

import com.luoshi.pojo.TbWaitingWork;
import com.luoshi.pojo.TbWaitingWorkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbWaitingWorkMapper {
    int countByExample(TbWaitingWorkExample example);

    int deleteByExample(TbWaitingWorkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbWaitingWork record);

    int insertSelective(TbWaitingWork record);

    List<TbWaitingWork> selectByExample(TbWaitingWorkExample example);

    TbWaitingWork selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbWaitingWork record, @Param("example") TbWaitingWorkExample example);

    int updateByExample(@Param("record") TbWaitingWork record, @Param("example") TbWaitingWorkExample example);

    int updateByPrimaryKeySelective(TbWaitingWork record);

    int updateByPrimaryKey(TbWaitingWork record);
}