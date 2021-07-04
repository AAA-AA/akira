package com.wuahh.arika.dao.mapper.ext;

import com.megvii.gdc.ci.dao.entity.ProjectConf;
import com.megvii.gdc.ci.dao.mapper.gen.ProjectConfMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: renhongqiang
 * @Date: 2020/8/14 2:01 下午
 **/
public interface ExtProjectConfMapper extends ProjectConfMapper {

    List<ProjectConf> list(@Param("keyword") String keyword, @Param("startRows") Integer startRows, @Param("pageSize") Integer pageSize);

    Integer projectListCount(@Param("keyword") String keyword);
}
