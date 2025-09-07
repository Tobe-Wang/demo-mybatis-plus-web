/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.web;

import cn.zhaofd.core.spring.mybatisplus.core.web.BaseController;
import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysTest;
import cn.zhaofd.demomybatisplusweb.modules.demo.service.intf.SysTestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 * 乐观锁插件示例
 *
 * @author zhaofd
 * @since 2025-09-07
 */
@RestController
@RequestMapping("/demo/sysTest")
public class SysTestController extends BaseController<SysTestService, SysTest> {

}
