/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.mapper;

import cn.zhaofd.demomybatisplusweb.modules.demo.entity.SysInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

/**
 * 手动配置的MyBatis-Plus应用示例测试
 */
@SpringBootTest
class SysInfoMapperTest {
    @Autowired
    private SysInfoMapper sysInfoMapper;

    @Test
    void selectList() {
        List<SysInfo> userList = sysInfoMapper.selectList(null);
        userList.forEach(System.out::println);
        Assert.notEmpty(userList, "用户列表为空");
    }
}
