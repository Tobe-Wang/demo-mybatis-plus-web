/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.web;

import cn.zhaofd.core.spring.mybatisplus.core.web.BaseController;
import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysInfo;
import cn.zhaofd.demomybatisplusweb.modules.demo.service.intf.SysInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 * 直接调用“MyBatis-Plus代码生成器”生成继承自定义父类的代码应用示例+自动填充字段示例
 *
 * @author zhaofd
 * @since 2025-09-06
 */
@RestController
@RequestMapping("/demo/sysInfo")
public class SysInfoController extends BaseController<SysInfoService, SysInfo> {

}
