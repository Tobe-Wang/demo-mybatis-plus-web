/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类s
 */
@Configuration
@MapperScan("cn.zhaofd.demomybatisplusweb.modules.demo.repository")
public class MyBatisPlusConfig {
}
