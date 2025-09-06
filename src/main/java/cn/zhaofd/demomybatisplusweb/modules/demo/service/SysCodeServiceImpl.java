/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.service;

import cn.zhaofd.core.spring.mybatisplus.core.service.BaseServiceImpl;
import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysCode;
import cn.zhaofd.demomybatisplusweb.modules.demo.mapper.SysCodeMapper;
import cn.zhaofd.demomybatisplusweb.modules.demo.service.intf.SysCodeService;
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
public class SysCodeServiceImpl extends BaseServiceImpl<SysCodeMapper, SysCode> implements SysCodeService {

}
