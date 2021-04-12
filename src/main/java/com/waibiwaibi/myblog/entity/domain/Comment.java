package com.waibiwaibi.myblog.entity.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * Copyright©2020 杭州悦玩网络科技有限公司
 *
 * @author CaoYuewen
 * @version 1.0.0
 * @date {2021/4/12}
 * @description 评论
 */
@EqualsAndHashCode(callSuper = false)
@Data
@Accessors(chain = true)
public class Comment {
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 更新时间
     */
    private Date updatedAt;
}
