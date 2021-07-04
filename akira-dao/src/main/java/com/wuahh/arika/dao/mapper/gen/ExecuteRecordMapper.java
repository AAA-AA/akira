package com.wuahh.arika.dao.mapper.gen;

import com.wuahh.arika.dao.entity.ExecuteRecord;
import com.wuahh.arika.dao.entity.ExecuteRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExecuteRecordMapper {
    long countByExample(ExecuteRecordExample example);

    int deleteByExample(ExecuteRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExecuteRecord record);

    int insertSelective(ExecuteRecord record);

    List<ExecuteRecord> selectByExampleWithBLOBs(ExecuteRecordExample example);

    List<ExecuteRecord> selectByExample(ExecuteRecordExample example);

    ExecuteRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExecuteRecord record, @Param("example") ExecuteRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") ExecuteRecord record, @Param("example") ExecuteRecordExample example);

    int updateByExample(@Param("record") ExecuteRecord record, @Param("example") ExecuteRecordExample example);

    int updateByPrimaryKeySelective(ExecuteRecord record);

    int updateByPrimaryKeyWithBLOBs(ExecuteRecord record);

    int updateByPrimaryKey(ExecuteRecord record);

    /** need allowMultiQueries=true support */
    int insertList(List<ExecuteRecord> records);

    /** need allowMultiQueries=true support */
    int insertListSelective(List<ExecuteRecord> records);
}