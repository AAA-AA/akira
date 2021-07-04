package com.wuahh.arika.dao.mapper.gen;

import com.wuahh.arika.dao.entity.ExecuteGroup;
import com.wuahh.arika.dao.entity.ExecuteGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExecuteGroupMapper {
    long countByExample(ExecuteGroupExample example);

    int deleteByExample(ExecuteGroupExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExecuteGroup record);

    int insertSelective(ExecuteGroup record);

    List<ExecuteGroup> selectByExampleWithBLOBs(ExecuteGroupExample example);

    List<ExecuteGroup> selectByExample(ExecuteGroupExample example);

    ExecuteGroup selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExecuteGroup record, @Param("example") ExecuteGroupExample example);

    int updateByExampleWithBLOBs(@Param("record") ExecuteGroup record, @Param("example") ExecuteGroupExample example);

    int updateByExample(@Param("record") ExecuteGroup record, @Param("example") ExecuteGroupExample example);

    int updateByPrimaryKeySelective(ExecuteGroup record);

    int updateByPrimaryKeyWithBLOBs(ExecuteGroup record);

    int updateByPrimaryKey(ExecuteGroup record);

    /** need allowMultiQueries=true support */
    int insertList(List<ExecuteGroup> records);

    /** need allowMultiQueries=true support */
    int insertListSelective(List<ExecuteGroup> records);
}