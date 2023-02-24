package com.yyp.crm.commons.utils;

import java.util.UUID;

/**
 * 作者: 元昱鹏
 * 时间: 2023-01-23
 */
public class UUIDUtils {
    /**
     * 获取UUID的值
     * @return
     */
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
