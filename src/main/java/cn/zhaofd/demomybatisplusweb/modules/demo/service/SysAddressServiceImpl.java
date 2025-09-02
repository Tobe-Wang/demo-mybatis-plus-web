/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.service;

import cn.zhaofd.core.spring.mybatisplus.core.service.BaseServiceImpl;
import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysAddress;
import cn.zhaofd.demomybatisplusweb.modules.demo.mapper.SysAddressMapper;
import cn.zhaofd.demomybatisplusweb.modules.demo.service.intf.SysAddressService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 * 直接调用“MyBatis-Plus代码生成器”生成继承自定义父类的代码应用示例
 *
 * @author zhaofd
 * @since 2025-09-02
 */
@Service
public class SysAddressServiceImpl extends BaseServiceImpl<SysAddressMapper, SysAddress> implements SysAddressService {
    /**
     * 是否启用缓存
     * <br />辅助方法用于缓存注解中的condition检查
     *
     * @return true启用缓存；false不启用缓存
     */
    @Override
    public boolean isCacheEnabled() {
        return true;
    }
}
