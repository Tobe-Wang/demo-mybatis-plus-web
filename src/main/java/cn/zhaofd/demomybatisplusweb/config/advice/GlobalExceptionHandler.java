/*
 * Copyright (c) 2025. Tobe Wang
 */

package cn.zhaofd.demomybatisplusweb.config.advice;

import cn.zhaofd.core.spring.web.config.advice.BaseGlobalExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局Controller异常处理
 */
@RestControllerAdvice
public class GlobalExceptionHandler extends BaseGlobalExceptionHandler {
}
