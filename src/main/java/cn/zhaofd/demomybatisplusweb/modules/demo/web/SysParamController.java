/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.web;

import cn.zhaofd.core.net.exception.HttpException;
import cn.zhaofd.core.spring.validation.ValidationUtil;
import cn.zhaofd.demomybatisplusweb.core.dto.DataSet;
import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysParam;
import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysUser;
import cn.zhaofd.demomybatisplusweb.modules.demo.service.intf.SysParamService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 * 直接调用“MyBatis-Plus代码生成器”代码应用示例+注解方式配置的MyBatis应用示例
 *
 * @author zhaofd
 * @since 2025-08-30
 */
@RestController
@RequestMapping("/demo/sysParam")
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

    /**
     * 保存(前端form对象数据)
     *
     * @param dto    DTO数据传输对象
     * @param errors Errors对象
     * @return 保存后的DTO数据传输对象
     */
    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public SysParam saveFormData(@Valid @ModelAttribute SysParam dto, Errors errors) {
        // 输入参数验证
        if (dto == null) {
            throw new HttpException(HttpStatus.BAD_REQUEST.value(), "接口参数不能为空");
        }
        if (errors.hasErrors()) {
            throw new HttpException(HttpStatus.BAD_REQUEST.value(), ValidationUtil.getFieldErrorMsg(errors));
        }

        return sysParamService.save(dto) ? dto : null;
    }

    /**
     * 批量保存
     *
     * @param ds 增、删、改数据集
     * @return 保存后的增、删、改数据集
     */
    @PostMapping(value = "/dataset", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public DataSet<SysParam, Integer> saveDataSet(@RequestBody DataSet<SysParam, Integer> ds) {
        // 删除
        if (ds.getDeletedIds() != null && !ds.getDeletedIds().isEmpty()) {
            sysParamService.removeBatchByIds(ds.getDeletedIds());
        }

        // 修改
        if (ds.getUpdatedList() != null && !ds.getUpdatedList().isEmpty()) {
            sysParamService.updateBatchById(ds.getUpdatedList());
        }

        // 增加
        if (ds.getInsertedList() != null && !ds.getInsertedList().isEmpty()) {
            sysParamService.saveBatch(ds.getInsertedList());
        }

        return ds;
    }

    /**
     * 修改(前端json对象数据)
     *
     * @param dto    DTO数据传输对象
     * @param errors Errors对象
     * @return 修改后的DTO数据传输对象
     */
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public SysParam updateById(@Valid @RequestBody SysParam dto, Errors errors) {
        // 输入参数验证
        if (errors.hasErrors()) {
            throw new HttpException(HttpStatus.BAD_REQUEST.value(), ValidationUtil.getFieldErrorMsg(errors));
        }

        return sysParamService.updateById(dto) ? dto : null;
    }

    /**
     * 修改(前端form对象数据)
     *
     * @param dto    DTO数据传输对象
     * @param errors Errors对象
     * @return 修改后的DTO数据传输对象
     */
    @PutMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public SysParam updateFormDataById(@Valid @ModelAttribute SysParam dto, Errors errors) {
        // 输入参数验证
        if (dto == null) {
            throw new HttpException(HttpStatus.BAD_REQUEST.value(), "接口参数不能为空");
        }
        if (errors.hasErrors()) {
            throw new HttpException(HttpStatus.BAD_REQUEST.value(), ValidationUtil.getFieldErrorMsg(errors));
        }

        return sysParamService.updateById(dto) ? dto : null;
    }

    /**
     * 删除
     *
     * @param id 主键id
     */
    @DeleteMapping(value = "/{id}")
    public void removeById(@PathVariable("id") Integer id) {
        sysParamService.removeById(id);
    }

    /**
     * 调用存储过程
     *
     * @param name 姓名
     * @return {@code List<SysUser>}
     */
    @GetMapping(value = "/procUser", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SysUser> procUser(@RequestParam String name) {
        return sysParamService.procUser(name);
    }
}
