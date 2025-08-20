/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Arrays;

/**
 * MyBatis-Plus代码生成器
 */
public class MyBatisPlusGenerator {
    /**
     * 需要生成的表名(多个以英文逗号分隔)
     * ★注意：代码生成前需配置★
     */
    private static final String tables = "sys_param";
    /**
     * 数据源配置
     * 【读取表注释配置】
     * 1、MySQL链接增加属性：remarks=true&useInformationSchema=true
     * 2、Oracle链接增加属性：remarks=true或者remarksReporting=true（某些驱动版本）
     * 3、SqlServer：驱动不支持
     */
    private static final String url = "jdbc:mysql://127.0.0.1:3306/demo?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false&remarks=true&useInformationSchema=true";
    /**
     * 数据源用户名
     */
    private static final String username = "root";
    /**
     * 数据源密码
     */
    private static final String password = "pwd@123QWE";
    /**
     * 作者
     */
    private static final String author = "zhaofd";
    /**
     * 输出目录
     */
    private static final String outputDir = "src\\main\\java";

    /**
     * 代码生成
     */
    public static void main(String[] args) {
        FastAutoGenerator.create(url, username, password) // 数据库基础配置
                // 数据库可选配置
                .dataSourceConfig(builder -> {
                    // 类型转换器
                    builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
//                        // 自定义类型转换
//                        int typeCode = metaInfo.getJdbcType().TYPE_CODE;
//                        if (typeCode == Types.SMALLINT) {
//                            return DbColumnType.INTEGER;
//                        }
                        return typeRegistry.getColumnType(metaInfo);
                    });
                })
                // 全局配置
                .globalConfig(builder -> {
                    builder.disableOpenDir() // 禁止自动打开输出目录
                            .outputDir(outputDir) // 指定代码生成的输出目录
                            .author(author) // 设置作者名
//                            .enableSwagger() // 开启swagger模式
//                            .commentDate("yyyy-MM-dd") // 设置注释日期格式，默认值yyyy-MM-dd
                    ;
                })
                // 包配置
                .packageConfig(builder -> {
                    builder.parent("cn.zhaofd.demomybatisplusweb.modules") // 设置父包名，默认值: com.baomidou
                            .moduleName("demo") // 设置父包模块名，默认值: 无
                            .entity("entity") // 设置实体类包名，默认值: entity
                            .mapper("mapper") // 设置Mapper接口包名，默认值: mapper
                            .xml("mapper.xml") // 设置Mapper XML文件包名，默认值: mapper.xml
//                            .pathInfo(Collections.singletonMap(OutputFile.xml, "src\\main\\resources\\mapper")) // 设置Mapper XML生成路径，与.xml()设置互斥
                            .service("service") // 设置Service接口包名，默认值: service
                            .serviceImpl("service.impl") // 设置Service实现类包名，默认值: service.impl
                            .controller("web") // 设置Controller包名，默认值: controller
                    ;
                })
                // 策略配置
                .strategyConfig(builder -> {
                    builder.enableSkipView() // 在生成代码时自动跳过数据库视图
                            .addInclude(Arrays.asList(tables.split(","))) // 设置需要生成的表名
//                            .addTablePrefix("t_", "c_") // 设置过滤表前缀
                            // Entity策略配置
                            .entityBuilder() // 启用Entity策略配置
                            .enableLombok() // 启用Lombok
                            .enableTableFieldAnnotation() // 开启生成实体时生成字段注解
//                            .versionColumnName("") // 乐观锁字段名(数据库字段)
//                            .versionPropertyName("") // 乐观锁属性名(实体)
                            .logicDeleteColumnName("") // 逻辑删除字段名(数据库字段)
                            .logicDeletePropertyName("") // 逻辑删除属性名(实体)
                            // Controller策略配置
                            .controllerBuilder() // 启用Controller策略配置
                            .enableHyphenStyle() // 开启驼峰转连字符
                            .enableRestStyle() // 开启生成@RestController 控制器
                    ;
                })
                // 自定义模板支持配置
                .templateEngine(new FreemarkerTemplateEngine()) // 设置模板引擎，包括：VelocityTemplateEngine(默认)、FreemarkerTemplateEngine、BeetlTemplateEngine、EnjoyTemplateEngine
                .execute();
    }
}
