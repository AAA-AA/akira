package com.wuahh.arika.dao.entity;

import java.time.LocalDateTime;
import lombok.Data;

/**
 * link table is repo_hook
 * Copyright © 2021, github and/or its affiliates. All rights reserved.
 **/
@Data
public class RepoHook {
    /**主键id*/
    private Integer id;

    /**对应仓库id*/
    private Integer repoId;

    /**设置gitlab-repo, webhook时产生的id*/
    private Integer hookId;

    /**回调地址*/
    private String callbackUrl;

    /**更新时间*/
    private LocalDateTime updateTime;

    /**创建时间*/
    private LocalDateTime createTime;
}