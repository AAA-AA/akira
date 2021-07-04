package com.wuahh.arika.dao.mapper.gen;

import com.wuahh.arika.dao.entity.RepoConf;
import com.wuahh.arika.dao.entity.RepoConfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepoConfMapper {
    long countByExample(RepoConfExample example);

    int deleteByExample(RepoConfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RepoConf record);

    int insertSelective(RepoConf record);

    List<RepoConf> selectByExample(RepoConfExample example);

    RepoConf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RepoConf record, @Param("example") RepoConfExample example);

    int updateByExample(@Param("record") RepoConf record, @Param("example") RepoConfExample example);

    int updateByPrimaryKeySelective(RepoConf record);

    int updateByPrimaryKey(RepoConf record);

    /** need allowMultiQueries=true support */
    int insertList(List<RepoConf> records);

    /** need allowMultiQueries=true support */
    int insertListSelective(List<RepoConf> records);
}