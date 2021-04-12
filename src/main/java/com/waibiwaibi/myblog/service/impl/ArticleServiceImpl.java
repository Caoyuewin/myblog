package com.waibiwaibi.myblog.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.extra.spring.SpringUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.waibiwaibi.myblog.dao.ArticleMapper;
import com.waibiwaibi.myblog.entity.domain.Article;
import com.waibiwaibi.myblog.entity.vo.ArticleVO;
import com.waibiwaibi.myblog.service.ArticleService;
import org.springframework.stereotype.Service;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Copyright©2020 杭州悦玩网络科技有限公司
 *
 * @author CaoYuewen
 * @date {2021/4/12}
 * @description
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
    @Override
    public boolean save(ArticleVO articleVO) {
        Article article = new Article();
        BeanUtil.copyProperties(articleVO, article);
        return save(article);
    }

    @Override
    public ArticleVO getById(Integer id) {
        ArticleVO articleVO = new ArticleVO();
        Article article = baseMapper.selectById(id);
        BeanUtil.copyProperties(article, articleVO);
        return articleVO;
    }

    public List<ArticleVO> listByIds()
}
