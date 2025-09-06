/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.mapper;

import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

/**
 * 直接调用“MyBatis-Plus代码生成器”生成继承自定义父类的代码应用示例+手动xml方式配置的MyBatis应用示例
 */
@SpringBootTest
class SysUserMapperTest {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Test
    void selectList() {
        List<SysUser> userList = sysUserMapper.selectList(null);
        userList.forEach(System.out::println);
        Assert.notEmpty(userList, "用户列表为空");
    }
}
