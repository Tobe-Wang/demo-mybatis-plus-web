/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * <p>
 * json字段类型处理示例
 * </p>
 *
 * @author zhaofd
 * @since 2025-09-07
 */
@Getter
@Setter
@ToString
@TableName(value = "sys_detail", autoResultMap = true)
public class SysDetail implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    /**
     * 其它信息
     */
    @TableField(value = "otherinfo", typeHandler = JacksonTypeHandler.class)
    private OtherInfo otherinfo;
}
