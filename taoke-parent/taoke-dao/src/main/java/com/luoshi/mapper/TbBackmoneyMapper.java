package com.luoshi.mapper;

import com.luoshi.pojo.TbBackmoney;
import com.luoshi.pojo.TbBackmoneyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBackmoneyMapper {
    int countByExample(TbBackmoneyExample example);

    int deleteByExample(TbBackmoneyExample example);

    int deleteByPrimaryKey(Integer bmId);

    int insert(TbBackmoney record);

    int insertSelective(TbBackmoney record);

    List<TbBackmoney> selectByExample(TbBackmoneyExample example);

    TbBackmoney selectByPrimaryKey(Integer bmId);

    int updateByExampleSelective(@Param("record") TbBackmoney record, @Param("example") TbBackmoneyExample example);

    int updateByExample(@Param("record") TbBackmoney record, @Param("example") TbBackmoneyExample example);

    int updateByPrimaryKeySelective(TbBackmoney record);

    int updateByPrimaryKey(TbBackmoney record);
}