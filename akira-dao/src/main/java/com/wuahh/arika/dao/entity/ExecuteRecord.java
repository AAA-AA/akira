package com.wuahh.arika.dao.entity;

import java.time.LocalDateTime;
import lombok.Data;

/**
 * link table is execute_record
 * Copyright © 2021, github and/or its affiliates. All rights reserved.
 **/
@Data
public class ExecuteRecord {
    /**主键id*/
    private Integer id;

    /**工程id*/
    private Integer projectId;

    /**工程名称*/
    private String projectName;

    /**关联配置id，当exec_type=1时为repo_conf主键id，exec_type=2时为pub_repo_conf表主键id*/
    private Integer repoConfId;

    /**对应仓库id*/
    private Integer repoId;

    /**repository名称*/
    private String repoName;

    /**分支名*/
    private String branch;

    /**execute_group主键id*/
    private Integer executeGroupId;

    /**构建使用的dockerfile名称*/
    private String dockerfile;

    /**编译环境，node,maven,python3,golang*/
    private String env;

    /**编译参数*/
    private String compileParam;

    /**构建镜像名*/
    private String imageName;

    /**任务执行状态，0初始化 1进行中 2成功 3失败*/
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