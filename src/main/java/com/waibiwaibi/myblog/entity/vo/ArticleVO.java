package com.waibiwaibi.myblog.entity.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * Copyright©2020 杭州悦玩网络科技有限公司
 *
 * @author CaoYuewen
 * @version 1.0.0
 * @date {2021/4/12}
 * @description 文章vo
 */
@Data
@Accessors(chain = true)
@ApiModel("文章VO")
public class ArticleVO implements Serializable {
    private Integer id;
    /**
     * 博客标题
     */
    @NotBlank(message = "文章标题不能为空")
    private String title;

    /**
     * 博客正文
     */
    @NotBlank(message = "文章内容不能为空")
    private String content;

    /**
     * 博客分类
     */
    @NotNull(message = "博客种类不能为空")
    private Integer kind;

    /**
     * 浏览量
     */
    private Integer viewCount;

    /**
     * 点赞量
     */
    private Integer favoriteCount;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 更新时间
     */
    private Date updatedAt;

}
