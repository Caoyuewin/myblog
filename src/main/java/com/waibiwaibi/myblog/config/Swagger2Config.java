package com.waibiwaibi.myblog.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Copyright©2020 杭州悦玩网络科技有限公司
 *
 * @author CaoYuewen
 * @version 1.0.0
 * @date {2021/4/12}
 * @description swagger配置
 */
@Configuration
public class Swagger2Config {
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.waibiwaibi.myblog.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("blog document")
                .description("blog document")
                .contact(new Contact("dave", null, null))
                .version("1.0")
                .build();
    }
}
