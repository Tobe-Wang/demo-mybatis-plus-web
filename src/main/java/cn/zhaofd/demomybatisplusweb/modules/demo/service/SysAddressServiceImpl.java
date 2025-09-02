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
 *
 * @author zhaofd
 * @since 2025-09-02
 */
@Service
public class SysAddressServiceImpl extends BaseServiceImpl<SysAddressMapper, SysAddress> implements SysAddressService {

}
