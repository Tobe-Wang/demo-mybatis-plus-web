/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.service;

import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysUser;
import cn.zhaofd.demomybatisplusweb.modules.demo.mapper.SysUserMapper;
import cn.zhaofd.demomybatisplusweb.modules.demo.service.intf.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 * 直接调用“MyBatis-Plus代码生成器”代码应用示例+手动xml方式配置的MyBatis应用示例
 *
 * @author zhaofd
 * @since 2025-09-02
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
    /**
     * 调用存储过程
     *
     * @param name 姓名
     * @return {@code List<SysUser>}
     */
    public List<SysUser> procUser(String name) {
        return baseMapper.procUser(name);
    }
}
