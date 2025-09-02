/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.service.intf;

import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 系统用户 服务类
 * </p>
 *
 * @author zhaofd
 * @since 2025-09-02
 */
public interface SysUserService extends IService<SysUser> {
    /**
     * 调用存储过程
     *
     * @param name 姓名
     * @return {@code List<SysUser>}
     */
    List<SysUser> procUser(String name);
}
