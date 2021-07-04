package com.wuahh.arika.dao.mapper.gen;

import com.wuahh.arika.dao.entity.PubChannel;
import com.wuahh.arika.dao.entity.PubChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PubChannelMapper {
    long countByExample(PubChannelExample example);

    int deleteByExample(PubChannelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PubChannel record);

    int insertSelective(PubChannel record);

    List<PubChannel> selectByExampleWithBLOBs(PubChannelExample example);

    List<PubChannel> selectByExample(PubChannelExample example);

    PubChannel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PubChannel record, @Param("example") PubChannelExample example);

    int updateByExampleWithBLOBs(@Param("record") PubChannel record, @Param("example") PubChannelExample example);

    int updateByExample(@Param("record") PubChannel record, @Param("example") PubChannelExample example);

    int updateByPrimaryKeySelective(PubChannel record);

    int updateByPrimaryKeyWithBLOBs(PubChannel record);

    int updateByPrimaryKey(PubChannel record);

    /** need allowMultiQueries=true support */
    int insertList(List<PubChannel> records);

    /** need allowMultiQueries=true support */
    int insertListSelective(List<PubChannel> records);
}