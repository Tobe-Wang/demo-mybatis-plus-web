/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.parser.JsqlParserGlobal;
import com.baomidou.mybatisplus.extension.parser.cache.FstSerialCaffeineJsqlParseCache;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * MyBatis-Plus配置类
 */
@Configuration
@MapperScan("cn.zhaofd.demomybatisplusweb.modules.demo.mapper")
// Spring Boot官方文档明确推荐使用@MapperScan方式，不推荐接口上注释@Mapper方式(单独初始化，当有大量@Mapper时（50+），启动时间显著增加)
public class MyBatisPlusConfig {
    static {
        // 1、配置本地缓存SQL解析
        JsqlParserGlobal.setJsqlParseCache(new FstSerialCaffeineJsqlParseCache((cache) -> cache.maximumSize(1024).expireAfterWrite(30, TimeUnit.SECONDS))); // 使用FST高性能序列化库缓存。优点：序列化速度极快，生成的缓存数据更小；缺点：需要额外引入fst依赖
//        JsqlParserGlobal.setJsqlParseCache(new JdkSerialCaffeineJsqlParseCache((cache) -> cache.maximumSize(1024).expireAfterWrite(30, TimeUnit.SECONDS))); // 使用JDK自带的序列化缓存。优点：无需引入额外依赖；缺点：速度较慢，生成的缓存数据较大
    }

    /**
     * 添加插件
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL)); // 【分页插件】如果配置多个插件, 切记分页最后添加；如果有多数据源可以不配具体类型, 否则都建议配上具体的DbType
        return interceptor;
    }
}
