/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.service.intf;

import cn.zhaofd.core.spring.mybatisplus.core.service.intf.BaseService;
import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysUser;

import java.util.List;

/**
 * <p>
 * 系统用户 服务类
 * </p>
 * 直接调用“MyBatis-Plus代码生成器”生成继承自定义父类的代码应用示例+手动xml方式配置的MyBatis应用示例
 *
 * @author zhaofd
 * @since 2025-09-02
 */
public interface SysUserService extends BaseService<SysUser> {
    /**
     * 调用存储过程
     *
     * @param name 姓名
     * @return {@code List<SysUser>}
     */
    List<SysUser> procUser(String name);
}
