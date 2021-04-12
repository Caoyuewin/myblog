package com.waibiwaibi.myblog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.waibiwaibi.myblog.entity.domain.Article;
import com.waibiwaibi.myblog.entity.vo.ArticleVO;

/**
 * Copyright©2020 杭州悦玩网络科技有限公司
 *
 * @author CaoYuewen
 * @version 1.0.0
 * @date {2021/4/12}
 * @description 文章相关服务
 */
public interface ArticleService extends IService<Article> {
    boolean save(ArticleVO articleVO);

    ArticleVO getById(Integer id);
}
