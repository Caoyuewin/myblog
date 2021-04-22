package com.waibiwaibi.myblog.controller;

import com.waibiwaibi.myblog.entity.vo.ArticleVO;
import com.waibiwaibi.myblog.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Copyright©2020 杭州悦玩网络科技有限公司
 *
 * @author CaoYuewen
 * @version 1.0.0
 * @date {2021/4/12}
 * @description 文章相关接口
 */
@RestController
@RequestMapping("/articles")
@RequiredArgsConstructor
@Api
public class ArticleController {
    private final ArticleService articleService;

    @ApiOperation("获取一篇博客")
    @GetMapping("/{article_id}")
    public ArticleVO get(@PathVariable("article_id") Integer articleId) {
        return articleService.getById(articleId);
    }

    @ApiOperation("获取多篇博客")
    @GetMapping("")
    public List<ArticleVO> batch(@RequestParam("ids") List<Integer> articleIds) {
        return articleService.listByIds(articleIds);
    }

    @ApiOperation("新增一篇博客")
    @PostMapping("")
    public boolean insert(@Valid @RequestBody ArticleVO article) {
        return articleService.save(article);
    }

    @ApiOperation("新增多篇博客")
    @PatchMapping("")
    public boolean insertBatch(@Valid @RequestBody List<ArticleVO> articleVOS) {
        return articleService.saveBatch(articleVOS);
    }
}
