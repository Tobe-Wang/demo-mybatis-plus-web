/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.service;

import cn.zhaofd.core.spring.mybatisplus.core.service.BaseServiceImpl;
import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysDetail;
import cn.zhaofd.demomybatisplusweb.modules.demo.mapper.SysDetailMapper;
import cn.zhaofd.demomybatisplusweb.modules.demo.service.intf.SysDetailService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 * json字段类型处理示例
 *
 * @author zhaofd
 * @since 2025-09-07
 */
@Service
public class SysDetailServiceImpl extends BaseServiceImpl<SysDetailMapper, SysDetail> implements SysDetailService {

}
