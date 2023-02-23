package com.yyp.crm.settings.service;

import com.yyp.crm.settings.domain.User;

import java.util.Map;

/**
 * 作者: 元昱鹏
 * 时间: 2023-01-22
 */
public interface UserService {
    User queryUserByLoginActAndPwd(Map<String, Object> map);
}
