package com.waibiwaibi.myblog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright©2020 杭州悦玩网络科技有限公司
 *
 * @author CaoYuewen
 * @date {2021/3/25}
 * @description
 */
@RestController
public class TestController {
    @GetMapping
    public void test() {
        System.out.println("test");
    }
}
