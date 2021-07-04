package com.wuahh.arika.dao.mapper.gen;

import com.wuahh.arika.dao.entity.ProjectConf;
import com.wuahh.arika.dao.entity.ProjectConfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectConfMapper {
    long countByExample(ProjectConfExample example);

    int deleteByExample(ProjectConfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProjectConf record);

    int insertSelective(ProjectConf record);

    List<ProjectConf> selectByExample(ProjectConfExample example);

    ProjectConf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProjectConf record, @Param("example") ProjectConfExample example);

    int updateByExample(@Param("record") ProjectConf record, @Param("example") ProjectConfExample example);

    int updateByPrimaryKeySelective(ProjectConf record);

    int updateByPrimaryKey(ProjectConf record);

    /** need allowMultiQueries=true support */
    int insertList(List<ProjectConf> records);

    /** need allowMultiQueries=true support */
    int insertListSelective(List<ProjectConf> records);
}