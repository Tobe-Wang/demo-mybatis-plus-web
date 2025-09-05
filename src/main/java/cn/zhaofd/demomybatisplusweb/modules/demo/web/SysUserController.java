/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.web;

import cn.zhaofd.core.spring.mybatisplus.core.web.BaseController;
import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysUser;
import cn.zhaofd.demomybatisplusweb.modules.demo.service.intf.SysUserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 系统用户 前端控制器
 * </p>
 * 直接调用“MyBatis-Plus代码生成器”生成继承自定义父类的代码应用示例+手动xml方式配置的MyBatis应用示例
 *
 * @author zhaofd
 * @since 2025-09-02
 */
@RestController
@RequestMapping("/demo/sysUser")
public class SysUserController extends BaseController<SysUserService, SysUser> {
    /**
     * 调用存储过程
     *
     * @param name 姓名
     * @return {@code List<SysUser>}
     */
    @GetMapping(value = "/procUser", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SysUser> procUser(@RequestParam String name) {
        return super.baseService.procUser(name);
    }
}
