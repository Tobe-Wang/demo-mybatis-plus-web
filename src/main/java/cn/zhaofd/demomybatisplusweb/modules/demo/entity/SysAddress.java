/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

/**
 * <p>
 * 直接调用“MyBatis-Plus代码生成器”生成继承自定义父类的代码应用示例
 * </p>
 *
 * @author zhaofd
 * @since 2025-09-02
 */
@Getter
@Setter
@ToString
@TableName("sys_address")
public class SysAddress implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("address")
    private String address;

    @TableField("zipcode")
    private String zipcode;

    @TableField("userid")
    private Integer userid;
    /**
     * 分组统计字段：数量
     */
    private Integer groupCount;
}
