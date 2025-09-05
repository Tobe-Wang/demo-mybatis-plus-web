/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.service;

import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysParam;
import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysUser;
import cn.zhaofd.demomybatisplusweb.modules.demo.mapper.SysParamMapper;
import cn.zhaofd.demomybatisplusweb.modules.demo.service.intf.SysParamService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 * 直接调用“MyBatis-Plus代码生成器”代码应用示例+注解方式配置的MyBatis应用示例
 *
 * @author zhaofd
 * @since 2025-08-30
 */
@Service
public class SysParamServiceImpl extends ServiceImpl<SysParamMapper, SysParam> implements SysParamService {
    /**
     * 调用存储过程
     *
     * @param name 姓名
     * @return {@code List<SysUser>}
     */
    public List<SysUser> procUser(String name) {
        return super.baseMapper.procUser(name);
    }
}
