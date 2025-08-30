/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.web;

import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysParam;
import cn.zhaofd.demomybatisplusweb.modules.demo.service.intf.SysParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 * 直接调用“MyBatis-Plus代码生成器”代码应用示例
 *
 * @author zhaofd
 * @since 2025-08-30
 */
@RestController
@RequestMapping("/demo/sys-param")
public class SysParamController {
    private final SysParamService sysParamService;

    public SysParamController(@Autowired SysParamService sysParamService) {
        this.sysParamService = sysParamService;
    }

    /**
     * 根据id查询
     *
     * @param id id
     * @return DTO数据传输对象
     */
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public SysParam getById(@PathVariable Integer id) {
        return sysParamService.getById(id);
    }

    /**
     * 查询
     *
     * @param columnMap 字段查询条件
     * @return DTO数据传输对象集合
     */
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<SysParam> listByMap(@RequestParam Map<String, Object> columnMap) {
        return sysParamService.listByMap(columnMap);
    }
}
