package com.wuahh.arika.dao.mapper.gen;

import com.wuahh.arika.dao.entity.RepoHook;
import com.wuahh.arika.dao.entity.RepoHookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepoHookMapper {
    long countByExample(RepoHookExample example);

    int deleteByExample(RepoHookExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RepoHook record);

    int insertSelective(RepoHook record);

    List<RepoHook> selectByExample(RepoHookExample example);

    RepoHook selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RepoHook record, @Param("example") RepoHookExample example);

    int updateByExample(@Param("record") RepoHook record, @Param("example") RepoHookExample example);

    int updateByPrimaryKeySelective(RepoHook record);

    int updateByPrimaryKey(RepoHook record);

    /** need allowMultiQueries=true support */
    int insertList(List<RepoHook> records);

    /** need allowMultiQueries=true support */
    int insertListSelective(List<RepoHook> records);
}