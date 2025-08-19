/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

/**
 * 手动配置的MyBatis-Plus应用示例
 */
@Data
@TableName("sys_info")
public class SysInfo implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String id;

    @Size(max = 32)
    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Shanghai") // Jackson库注解，用于JSON序列化和反序列化（Java对象<->JSON字符串）
    private Instant rcreatetime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Shanghai") // Jackson库注解，用于JSON序列化和反序列化（Java对象<->JSON字符串）
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Instant rupdatetime;
}
