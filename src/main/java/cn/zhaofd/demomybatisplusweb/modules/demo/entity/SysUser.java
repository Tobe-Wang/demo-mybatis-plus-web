/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.entity;

import cn.zhaofd.demomybatisplusweb.modules.type.SexType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 系统用户
 * </p>
 * 直接调用“MyBatis-Plus代码生成器”生成继承自定义父类的代码应用示例+手动xml方式配置的MyBatis应用示例
 *
 * @author zhaofd
 * @since 2025-09-02
 */
@Getter
@Setter
@ToString
@TableName("sys_user")
public class SysUser implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 姓名
     */
    @TableField("name")
    private String name;

    /**
     * 性别
     * <br />枚举示例
     */
    @TableField("sex")
    private SexType sex;

    /**
     * 登记时间
     */
    @TableField("regtime")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") // Spring框架注解，用于前端到后端的数据绑定（HTTP请求参数->Java对象）
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Shanghai") // Jackson库注解，用于JSON序列化和反序列化（Java对象<->JSON字符串）
    private LocalDateTime regtime;
}
