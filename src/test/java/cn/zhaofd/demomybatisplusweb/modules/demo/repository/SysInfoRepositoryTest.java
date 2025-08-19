/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.modules.demo.repository;

import cn.zhaofd.demomybatisplusweb.modules.demo.dto.SysInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class SysInfoRepositoryTest {
    @Autowired
    private SysInfoRepository sysInfoRepository;

    @Test
    void selectList() {
        List<SysInfo> userList = sysInfoRepository.selectList(null);
        Assert.notEmpty(userList, "用户列表为空");
        userList.forEach(System.out::println);
    }
}
