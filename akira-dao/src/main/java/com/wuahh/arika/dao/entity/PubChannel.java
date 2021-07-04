package com.wuahh.arika.dao.entity;

import java.time.LocalDateTime;
import lombok.Data;

/**
 * link table is pub_channel
 * Copyright © 2021, github and/or its affiliates. All rights reserved.
 **/
@Data
public class PubChannel {
    /**主键id*/
    private Integer id;

    /**pub_record表主键*/
    private Integer pubRecordId;

    /**0:不发布 1:hdfs 2:sdc 3:ftp(备选)*/
    private Integer channel;

    /**额外参数*/
    private String extParam;

    /**工程发布状态，0初始化 1发布中 2发布完成 3发布失败*/
    private Integer status;

    /**创建时间*/
    private LocalDateTime createTime;

    /**更新时间*/
    private LocalDateTime updateTime;

    /**输出信息*/
    private String outputMessage;
}