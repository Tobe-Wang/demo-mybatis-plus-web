/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.service.intf;

import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysParam;
import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 * 直接调用“MyBatis-Plus代码生成器”代码应用示例+注解方式配置的MyBatis应用示例
 *
 * @author zhaofd
 * @since 2025-08-30
 */
public interface SysParamService extends IService<SysParam> {
    /**
     * 调用存储过程
     *
     * @param name 姓名
     * @return {@code List<SysUser>}
     */
    List<SysUser> procUser(String name);
}
