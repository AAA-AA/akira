package com.wuahh.arika.dao.entity;

import java.time.LocalDateTime;
import lombok.Data;

/**
 * link table is execute_group
 * Copyright © 2021, github and/or its affiliates. All rights reserved.
 **/
@Data
public class ExecuteGroup {
    /**主键id*/
    private Integer id;

    /**工程表主键*/
    private Integer projectId;

    /**repo_conf表主键id*/
    private Integer repoConfId;

    /**分支名*/
    private String branch;

    /**当前组批次*/
    private String batchNum;

    /**组状态，0初始化 1进行中 2成功 3失败*/
    private Integer status;

    /**最后commit_id，截取8位*/
    private String commitId;

    /**commit信息*/
    private String commitMessage;

    /**更新时间*/
    private LocalDateTime updateTime;

    /**创建时间*/
    private LocalDateTime createTime;

    /**输出信息*/
    private String outputMessage;
}