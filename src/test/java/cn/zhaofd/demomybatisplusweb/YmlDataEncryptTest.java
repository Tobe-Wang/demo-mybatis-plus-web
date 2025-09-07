/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb;

import cn.zhaofd.core.base.StringUtil;
import com.baomidou.mybatisplus.core.toolkit.AES;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Yml数据加密
 * <br />应用方法：在idea中设置(“运行/调试配置”->“修改选项”->“程序实参”)，或在服务器上设置为启动环境变量
 * <br />--mpw.key=d1104d7c3b616f0b
 */
@Slf4j
public class YmlDataEncryptTest {
    private static final String aesKey = "DuJTJoq0MSefawPY"; // AES密钥

    /**
     * 获取16位随机AES密钥
     */
    @Test
    public void getAESKey() {
        String randomKey = AES.generateRandomKey();
        log.info("随机密钥：{}", randomKey);
        assertFalse(StringUtil.isNullOrEmpty(randomKey));
    }

    /**
     * 使用AES密钥加密数据
     */
    @Test
    public void encrypt() {
        // 开发环境
        String devMySQLUrl = "jdbc:mysql://127.0.0.1:3306/demo?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf8&allowPublicKeyRetrieval=true&useSSL=false"; // MySQL连接地址
        String devMySQLUsername = "root"; // MySQL用户名
        String devMySQLPassword = "pwd@123QWE"; // MySQL密码
        // 生产环境

        /*
        2025-09-07 08:10:22.734 [main] INFO  c.z.d.YmlDataEncryptTest - MySQL连接地址：mpw:wNkRJDgNypDKnfq0EnuejdgXe+wgD4dBtihzXq4Zyxims5K60XXfEVH+DchN098GN31DeS+N8qNeTZ5ihiLBzPbBcaeuqbVMq6j2dsVKabEBnlSSsrltVEAvEvmpmbez/f33n5Yz5YoxjHyicuPylShj0yolkyrsUq+6Coesmxg343EDJMtbeSwbAnJ5ryuc
        2025-09-07 08:10:22.740 [main] INFO  c.z.d.YmlDataEncryptTest - MySQL用户名：mpw:Kmp/OLciH5DfBWC0XndCSQ==
        2025-09-07 08:10:22.740 [main] INFO  c.z.d.YmlDataEncryptTest - MySQL密码：mpw:8qdhLVJcOfY4wQl3dkarVQ==
        */
        log.info("MySQL连接地址：mpw:{}", AES.encrypt(devMySQLUrl, aesKey));
        log.info("MySQL用户名：mpw:{}", AES.encrypt(devMySQLUsername, aesKey));
        log.info("MySQL密码：mpw:{}", AES.encrypt(devMySQLPassword, aesKey));
        assertTrue(true);
    }
}
