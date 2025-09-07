/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.service;

import cn.zhaofd.core.spring.mybatisplus.core.service.BaseServiceImpl;
import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysTest;
import cn.zhaofd.demomybatisplusweb.modules.demo.mapper.SysTestMapper;
import cn.zhaofd.demomybatisplusweb.modules.demo.service.intf.SysTestService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 * 乐观锁插件示例
 *
 * @author zhaofd
 * @since 2025-09-07
 */
@Service
public class SysTestServiceImpl extends BaseServiceImpl<SysTestMapper, SysTest> implements SysTestService {

}
