/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.web;

import cn.zhaofd.core.spring.mybatisplus.core.web.BaseController;
import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysAddress;
import cn.zhaofd.demomybatisplusweb.modules.demo.service.intf.SysAddressService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhaofd
 * @since 2025-09-02
 */
@RestController
@RequestMapping("/demo/sysAddress")
public class SysAddressController extends BaseController<SysAddressService, SysAddress> {

}
