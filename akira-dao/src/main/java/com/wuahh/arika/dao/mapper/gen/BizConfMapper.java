package com.wuahh.arika.dao.mapper.gen;

import com.wuahh.arika.dao.entity.BizConf;
import com.wuahh.arika.dao.entity.BizConfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizConfMapper {
    long countByExample(BizConfExample example);

    int deleteByExample(BizConfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BizConf record);

    int insertSelective(BizConf record);

    List<BizConf> selectByExample(BizConfExample example);

    BizConf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BizConf record, @Param("example") BizConfExample example);

    int updateByExample(@Param("record") BizConf record, @Param("example") BizConfExample example);

    int updateByPrimaryKeySelective(BizConf record);

    int updateByPrimaryKey(BizConf record);

    /** need allowMultiQueries=true support */
    int insertList(List<BizConf> records);

    /** need allowMultiQueries=true support */
    int insertListSelective(List<BizConf> records);
}