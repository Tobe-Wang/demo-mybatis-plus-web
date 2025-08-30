/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.web;

import cn.zhaofd.core.net.exception.HttpException;
import cn.zhaofd.core.spring.validation.ValidationUtil;
import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysParam;
import cn.zhaofd.demomybatisplusweb.modules.demo.service.intf.SysParamService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.Errors;
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

    /**
     * 保存(前端json对象数据)
     *
     * @param dto    DTO数据传输对象
     * @param errors Errors对象
     * @return 保存后的DTO数据传输对象
     */
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public SysParam save(@Valid @RequestBody SysParam dto, Errors errors) {
        // 输入参数验证
        if (errors.hasErrors()) {
            throw new HttpException(HttpStatus.BAD_REQUEST.value(), ValidationUtil.getFieldErrorMsg(errors));
        }

        return sysParamService.save(dto) ? dto : null;
    }
}
