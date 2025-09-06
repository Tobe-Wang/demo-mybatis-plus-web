/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.service;

import cn.zhaofd.core.spring.mybatisplus.core.service.BaseServiceImpl;
import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysInfo;
import cn.zhaofd.demomybatisplusweb.modules.demo.mapper.SysInfoMapper;
import cn.zhaofd.demomybatisplusweb.modules.demo.service.intf.SysInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhaofd
 * @since 2025-09-06
 */
@Service
public class SysInfoServiceImpl extends BaseServiceImpl<SysInfoMapper, SysInfo> implements SysInfoService {

}
