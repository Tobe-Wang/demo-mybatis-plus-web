/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.type;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 性别枚举
 */
@Getter
@AllArgsConstructor
public enum SexType {
    /**
     * 男
     */
    MALE("1", "男"),
    /**
     * 女
     */
    FEMALE("2", "女"),
    /**
     * 未知
     */
    UNKNOWN("0", "未知");

    @EnumValue // 注解标记数据库存的值
    @JsonValue // 注解标记JSON返回的值
    private final String code; // 性别代码
    private final String name; // 性别名称
}
