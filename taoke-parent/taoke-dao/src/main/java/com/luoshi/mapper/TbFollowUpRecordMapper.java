package com.luoshi.mapper;

import com.luoshi.pojo.TbFollowUpRecord;
import com.luoshi.pojo.TbFollowUpRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbFollowUpRecordMapper {
    int countByExample(TbFollowUpRecordExample example);

    int deleteByExample(TbFollowUpRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbFollowUpRecord record);

    int insertSelective(TbFollowUpRecord record);

    List<TbFollowUpRecord> selectByExample(TbFollowUpRecordExample example);

    TbFollowUpRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbFollowUpRecord record, @Param("example") TbFollowUpRecordExample example);

    int updateByExample(@Param("record") TbFollowUpRecord record, @Param("example") TbFollowUpRecordExample example);

    int updateByPrimaryKeySelective(TbFollowUpRecord record);

    int updateByPrimaryKey(TbFollowUpRecord record);
}