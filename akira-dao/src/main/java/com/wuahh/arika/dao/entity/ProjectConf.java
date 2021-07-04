package com.wuahh.arika.dao.entity;

import java.time.LocalDateTime;
import lombok.Data;

/**
 * link table is project_conf
 * Copyright © 2021, github and/or its affiliates. All rights reserved.
 **/
@Data
public class ProjectConf {
    /**主键id*/
    private Integer id;

    /**工程名称*/
    private String name;

    /**更新时间*/
    private LocalDateTime updateTime;

    /**创建时间*/
    private LocalDateTime createTime;
}