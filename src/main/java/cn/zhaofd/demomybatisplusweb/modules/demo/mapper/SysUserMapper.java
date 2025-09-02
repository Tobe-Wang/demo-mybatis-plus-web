/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.mapper;

import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 系统用户 Mapper 接口
 * </p>
 * 直接调用“MyBatis-Plus代码生成器”代码应用示例+手动xml方式配置的MyBatis应用示例
 *
 * @author zhaofd
 * @since 2025-09-02
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
    /**
     * 调用存储过程
     *
     * @param name 姓名
     * @return {@code List<SysUser>}
     */
    List<SysUser> procUser(String name);
}
