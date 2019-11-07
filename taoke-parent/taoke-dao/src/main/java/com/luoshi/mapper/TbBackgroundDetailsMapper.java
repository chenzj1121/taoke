package com.luoshi.mapper;

import com.luoshi.pojo.TbBackgroundDetails;
import com.luoshi.pojo.TbBackgroundDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBackgroundDetailsMapper {
    int countByExample(TbBackgroundDetailsExample example);

    int deleteByExample(TbBackgroundDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbBackgroundDetails record);

    int insertSelective(TbBackgroundDetails record);

    List<TbBackgroundDetails> selectByExample(TbBackgroundDetailsExample example);
    List<TbBackgroundDetails> selectByExample2(TbBackgroundDetailsExample example);

    TbBackgroundDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbBackgroundDetails record, @Param("example") TbBackgroundDetailsExample example);

    int updateByExample(@Param("record") TbBackgroundDetails record, @Param("example") TbBackgroundDetailsExample example);

    int updateByPrimaryKeySelective(TbBackgroundDetails record);

    int updateByPrimaryKey(TbBackgroundDetails record);

	
}