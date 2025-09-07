/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.web;

import cn.zhaofd.core.spring.mybatisplus.core.web.BaseController;
import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysDetail;
import cn.zhaofd.demomybatisplusweb.modules.demo.service.intf.SysDetailService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 * json字段类型处理示例
 *
 * @author zhaofd
 * @since 2025-09-07
 */
@RestController
@RequestMapping("/demo/sysDetail")
public class SysDetailController extends BaseController<SysDetailService, SysDetail> {

}
