package com.wuahh.arika.dao.entity;

import java.time.LocalDateTime;
import lombok.Data;

/**
 * link table is repo_conf
 * Copyright © 2021, github and/or its affiliates. All rights reserved.
 **/
@Data
public class RepoConf {
    /**主键id*/
    private Integer id;

    /**工程id*/
    private Integer projectId;

    /**工程名称*/
    private String projectName;

    /**仓库id*/
    private Integer repoId;

    /**仓库名称*/
    private String repoName;

    /**源码地址*/
    private String gitUrl;

    /**发布时选择的分支*/
    private String branch;

    /**docker文件列表，用英文,分开*/
    private String dockerfiles;

    /**是否采取dev构建，0：否 1：是，采取dev构建时，镜像号不变*/
    private Integer devBuild;

    /**编译环境，node,maven,python3,golang*/
    private String env;

    /**编译参数*/
    private String compileParam;

    /**更新时间*/
    private LocalDateTime updateTime;

    /**创建时间*/
    private LocalDateTime createTime;
}