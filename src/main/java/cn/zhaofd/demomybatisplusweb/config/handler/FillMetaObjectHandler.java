/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.config.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * 字段自动填充功能处理器
 */
@Component
public class FillMetaObjectHandler implements MetaObjectHandler {
    /**
     * 新增数据填充
     *
     * @param metaObject 元数据对象
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "deleted", Boolean.class, false); // 逻辑删除字段
        this.strictInsertFill(metaObject, "rcreatetime", LocalDateTime.class, LocalDateTime.now()); // 记录创建时间字段
    }

    /**
     * 更新数据填充
     *
     * @param metaObject 元数据对象
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject, "rupdatetime", LocalDateTime.class, LocalDateTime.now()); // 记录更新时间字段
    }
}
