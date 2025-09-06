/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 直接调用“MyBatis-Plus代码生成器”生成继承自定义父类的代码应用示例+自动填充字段示例
 * </p>
 *
 * @author zhaofd
 * @since 2025-09-06
 */
@Getter
@Setter
@ToString
@TableName("sys_info")
public class SysInfo implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    @TableField("name")
    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Shanghai") // Jackson库注解，用于JSON序列化和反序列化（Java对象<->JSON字符串）
    @TableField(value = "rcreatetime", fill = FieldFill.INSERT)
    private LocalDateTime rcreatetime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Shanghai") // Jackson库注解，用于JSON序列化和反序列化（Java对象<->JSON字符串）
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @TableField(value = "rupdatetime", fill = FieldFill.UPDATE)
    private LocalDateTime rupdatetime;
}
