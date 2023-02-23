package com.yyp.crm.settings.service.impl;

import com.yyp.crm.settings.domain.User;
import com.yyp.crm.settings.mapper.UserMapper;
import com.yyp.crm.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 作者: 元昱鹏
 * 时间: 2023-01-22
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserByLoginActAndPwd(Map<String, Object> map) {
        return userMapper.selectUserByLoginActAndPwd(map);
    }
}
