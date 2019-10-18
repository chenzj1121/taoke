package com.luoshi.mapper;

import com.luoshi.pojo.TbCheckmoneys;
import com.luoshi.pojo.TbCheckmoneysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCheckmoneysMapper {
    int countByExample(TbCheckmoneysExample example);

    int deleteByExample(TbCheckmoneysExample example);

    int deleteByPrimaryKey(Integer cmId);

    int insert(TbCheckmoneys record);

    int insertSelective(TbCheckmoneys record);

    List<TbCheckmoneys> selectByExample(TbCheckmoneysExample example);

    TbCheckmoneys selectByPrimaryKey(Integer cmId);

    int updateByExampleSelective(@Param("record") TbCheckmoneys record, @Param("example") TbCheckmoneysExample example);

    int updateByExample(@Param("record") TbCheckmoneys record, @Param("example") TbCheckmoneysExample example);

    int updateByPrimaryKeySelective(TbCheckmoneys record);

    int updateByPrimaryKey(TbCheckmoneys record);
}