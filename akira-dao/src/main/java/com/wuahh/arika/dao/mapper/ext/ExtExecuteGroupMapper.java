package com.wuahh.arika.dao.mapper.ext;

import com.wuahh.arika.dao.entity.ExecuteGroup;
import com.wuahh.arika.dao.mapper.gen.ExecuteGroupMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: renhongqiang
 * @Date: 2020/8/14 3:16 下午
 **/
public interface ExtExecuteGroupMapper extends ExecuteGroupMapper {

    List<ExecuteGroup> list(@Param(value = "repoConfId") Integer repoConfId, @Param("startRows") Integer startRows, @Param("pageSize") Integer pageSize);

    List<ExecuteGroup> listByIds(@Param(value = "list") List<Integer> list,  @Param("startRows") Integer startRows, @Param("pageSize") Integer pageSize);

    Integer listByIdsCount(@Param(value = "list") List<Integer> list);
}
