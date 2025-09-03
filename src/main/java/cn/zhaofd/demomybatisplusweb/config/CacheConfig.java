/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.config;

import cn.zhaofd.core.spring.mybatisplus.config.cache.EntityCacheResolver;
import cn.zhaofd.core.spring.mybatisplus.config.cache.EntityQueryCacheResolver;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 缓存配置
 */
@Configuration
@EnableCaching
@ComponentScan(basePackageClasses = {EntityCacheResolver.class, EntityQueryCacheResolver.class})
public class CacheConfig {
}
