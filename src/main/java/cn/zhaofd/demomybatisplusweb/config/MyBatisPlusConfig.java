/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis-Plus配置类
 */
@Configuration
@MapperScan("cn.zhaofd.demomybatisplusweb.modules.demo.mapper") // Spring Boot官方文档明确推荐使用@MapperScan方式，不推荐接口上注释@Mapper方式(单独初始化，当有大量@Mapper时（50+），启动时间显著增加)
public class MyBatisPlusConfig {
}
