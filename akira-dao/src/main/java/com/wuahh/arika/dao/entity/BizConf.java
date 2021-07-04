package com.wuahh.arika.dao.entity;

import java.time.LocalDateTime;
import lombok.Data;

/**
 * link table is biz_conf
 * Copyright © 2021, github and/or its affiliates. All rights reserved.
 **/
@Data
public class BizConf {
    /**主键id*/
    private Integer id;

    /**所属业务组*/
    private String bizGroup;

    /**配置key*/
    private String bizKey;

    /**配置值*/
    private String value;

    /**更新时间*/
    private LocalDateTime updateTime;

    /**创建时间*/
    private LocalDateTime createTime;
}