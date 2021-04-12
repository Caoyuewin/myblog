package com.waibiwaibi.myblog.entity.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * Copyright©2020 杭州悦玩网络科技有限公司
 *
 * @author CaoYuewen
 * @version 1.0.0
 * @date {2021/4/12}
 * @description 文章种类vo
 */
@Data
@Accessors(chain = true)
public class KindVO implements Serializable {
    /**
     * 分类名称
     */
    private String name;

    /**
     * 分类简介
     */
    private String introduction;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 更新时间
     */
    private Date updatedAt;
}
