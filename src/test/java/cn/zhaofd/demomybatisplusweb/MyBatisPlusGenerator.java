/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb;

import cn.zhaofd.core.spring.mybatisplus.core.service.BaseServiceImpl;
import cn.zhaofd.core.spring.mybatisplus.core.service.intf.BaseService;
import cn.zhaofd.core.spring.mybatisplus.core.web.BaseController;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.IFill;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.builder.CustomFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * MyBatis-Plus代码生成器
 */
public class MyBatisPlusGenerator {
    /**
     * 需要生成的表名(多个以英文逗号分隔)
     * ★注意：代码生成前需配置★
     */
    private static final String tables = "sys_info";
    /**
     * 父包名
     * ★注意：代码生成前需配置★
     */
    private static final String parentPackage = "cn.zhaofd.demomybatisplusweb.modules";
    /**
     * 模块名
     * ★注意：代码生成前需配置★
     */
    private static final String moduleName = "demo";
    /**
     * Mapper XML生成路径
     * ★注意：代码生成前需配置★
     */
    private static final String pathInfo = "src\\main\\resources\\mapper\\demo";

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
     * 表字段填充
     */
    private static final List<IFill> fills = Arrays.asList(new Column("rcreatetime", FieldFill.INSERT), new Column("rupdatetime", FieldFill.UPDATE));
    /**
     * 逻辑删除字段名(数据库字段)
     */
    private static final String logicDelColumn = "deleted";
    /**
     * 逻辑删除属性名(实体)
     */
    private static final String logicDelProperty = "deleted";

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
//                            .enableSwagger() // 开启swagger模式，自动生成api注解
//                            .commentDate("yyyy-MM-dd") // 设置注释日期格式，默认值yyyy-MM-dd
                    ;
                })
                // 包配置
                .packageConfig(builder -> {
                    builder.parent(parentPackage) // 设置父包名，默认值: com.baomidou
                            .moduleName(moduleName) // 设置父包模块名，默认值: 无
                            .entity("entity") // 设置实体类包名，默认值: entity
                            .mapper("mapper") // 设置Mapper接口包名，默认值: mapper
//                            .xml("mapper.xml") // 设置Mapper XML文件包名，默认值: mapper.xml
                            .pathInfo(Collections.singletonMap(OutputFile.xml, pathInfo)) // 设置Mapper XML生成路径，与.xml()设置互斥
                            .service("service.intf") // 设置Service接口包名，默认值: service
                            .serviceImpl("service") // 设置Service实现类包名，默认值: service.impl
                            .controller("web") // 设置Controller包名，默认值: controller
                    ;
                })
                // 策略配置
                .strategyConfig(builder -> {
                    builder.enableSkipView() // 在生成代码时自动跳过数据库视图
                            .addInclude(Arrays.asList(tables.split(","))) // 设置需要生成的表名
//                            .addTablePrefix("t_", "c_") // 设置过滤表前缀
                    ;

                    // Entity策略配置
                    builder.entityBuilder() // 启用Entity策略配置
                            .enableLombok() // 启用Lombok
                            .enableTableFieldAnnotation() // 开启生成实体时生成字段注解
//                            .versionColumnName("") // 乐观锁字段名(数据库字段)
//                            .versionPropertyName("") // 乐观锁属性名(实体)
                            .logicDeleteColumnName(logicDelColumn) // 逻辑删除字段名(数据库字段)
                            .logicDeletePropertyName(logicDelProperty) // 逻辑删除属性名(实体)
                            .addTableFills(fills) // 添加表字段填充
                    ;

                    // Service策略配置
                    builder.serviceBuilder() // 启用Service策略配置
                            .superServiceClass(BaseService.class) // 【自定义】Service接口父类，不设置则使用MyBatis-Plus提供的Service接口
                            .superServiceImplClass(BaseServiceImpl.class) // 【自定义】Service实现类父类，不设置则使用MyBatis-Plus提供的ServiceImpl父类
                            .formatServiceFileName("%sService") // Service接口文件名格式，默认值：I%sService
//                            .formatServiceImplFileName("%sServiceImpl") // Service实现类文件名格式，默认值：%sServiceImpl
                    ;

                    // Controller策略配置
                    builder.controllerBuilder() // 启用Controller策略配置
                            .superClass(BaseController.class) // 【自定义】Controller父类，不设置则使用MyBatis-Plus提供的Controller父类
//                            .enableHyphenStyle() // 开启驼峰转连字符，请求路径中单词之间使用连字符。例@RequestMapping("/demo/sys-param")
                            .enableRestStyle() // 开启生成@RestController 控制器
                            .disable() // 禁用默认生成，使用注入配置中的customFile指定模板生成
                    ;
                })
                // 注入配置
                .injectionConfig(builder -> {
                    // 输出文件之前执行：动态设置Controller的import和泛型参数
                    builder.beforeOutputFile((tableInfo, objectMap) -> {
                        // 获取包配置信息
                        //noinspection unchecked
                        Map<String, String> packageConfig = (Map<String, String>) objectMap.get("package");
                        String entityPackage = packageConfig.get("Entity"); // 获取entity包路径
                        String servicePackage = packageConfig.get("Service"); // 获取service包路径
                        // 获取实体类名
                        String entityName = tableInfo.getEntityName();

                        // 按项目配置自定义构建
                        String serviceName = entityName + "Service"; // 构建Service类名
                        String entityClass = entityPackage + "." + entityName; // 构建Entity类路径
                        String serviceClass = servicePackage + "." + serviceName; // 构建Service类路径

                        // 设置Controller父类泛型
                        String superClass = String.format("BaseController<%s, %s>", serviceName, entityName); // 替换Controller父类中的占位符
                        objectMap.put("superControllerClass", superClass);

                        // 设置Controller类导入包的自定义属性
                        List<String> importControllerPackages = Arrays.asList(entityClass, serviceClass);
                        objectMap.put("importControllerPackages", importControllerPackages);
                    });

                    // 自定义配置模板文件
                    builder.customFile(new CustomFile.Builder().fileName("Controller.java") // 文件名称
                            .templatePath("/templates/controller.java.ftl") // 指定生成模板路径
                            .packageName("web") // 包名,自3.5.10开始，可通过在package里面获取自定义包全路径
                            .build());
                })
                // 自定义模板支持配置
                .templateEngine(new FreemarkerTemplateEngine()) // 设置模板引擎，包括：VelocityTemplateEngine(默认)、FreemarkerTemplateEngine、BeetlTemplateEngine、EnjoyTemplateEngine
                .execute();
    }
}
