/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.web;

import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysUser;
import cn.zhaofd.demomybatisplusweb.modules.demo.service.intf.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
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
 *
 * @author zhaofd
 * @since 2025-09-02
 */
@RestController
@RequestMapping("/demo/sysUser")
public class SysUserController {
    private final SysUserService sysUserService;

    public SysUserController(@Autowired SysUserService sysUserService) {
        this.sysUserService = sysUserService;
    }

    /**
     * 调用存储过程
     *
     * @param name 姓名
     * @return {@code List<SysUser>}
     */
    @GetMapping(value = "/procUser", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SysUser> procUser(@RequestParam String name) {
        return sysUserService.procUser(name);
    }
}
