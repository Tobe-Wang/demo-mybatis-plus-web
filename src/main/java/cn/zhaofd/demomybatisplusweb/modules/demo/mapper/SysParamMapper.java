/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.mapper;

import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysParam;
import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 * 直接调用“MyBatis-Plus代码生成器”代码应用示例+注解方式配置的MyBatis应用示例
 *
 * @author zhaofd
 * @since 2025-08-30
 */
public interface SysParamMapper extends BaseMapper<SysParam> {
    /**
     * 调用存储过程
     *
     * @param name 姓名
     * @return {@code List<SysUser>}
     */
    // @formatter:off
    @Results(id = "mapSysUser", value = {
            @Result(property = "id", column = "id", id = true),
            @Result(property = "name", column = "name"),
            @Result(property = "sex", column = "sex"),
            @Result(property = "regtime", column = "regtime")
    })
    // @formatter on
    @Select("{call proc_user(#{name,mode=IN,javaType=String,jdbcType=VARCHAR})}")
    @Options(statementType = StatementType.CALLABLE)
    List<SysUser> procUser(String name);
}
