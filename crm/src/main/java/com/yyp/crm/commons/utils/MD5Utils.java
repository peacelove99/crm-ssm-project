package com.yyp.crm.commons.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * 作者: 元昱鹏
 * 时间: 2023-01-23
 */
public class MD5Utils {

    /**
     * 带秘钥加密
     * @param text
     * @param key
     * @return
     * @throws Exception
     */
    public static String md5(String text, String key) throws Exception {
        // 加密后的字符串
        String md5str = DigestUtils.md5Hex(text + key);
        System.out.println("MD5加密后的字符串为:" + md5str);
        return md5str;
    }

    /**
     * 不带密钥加密
     * @param text
     * @return
     * @throws Exception
     */
    public static String md52(String text) throws Exception {
        // 加密后的字符串
        String md5str = DigestUtils.md5Hex(text);
        System.out.println("MD52加密后的字符串为:" + md5str + "\t长度：" + md5str.length());
        return md5str;
    }

    /**
     * MD5验证
     * 根据传入的密钥进行验证
     * @param text
     * @param key
     * @param md5
     * @return
     * @throws Exception
     */
    public static boolean verify(String text, String key, String md5) throws Exception {
        String md5str = md5(text, key);
        if (md5str.equalsIgnoreCase(md5)) {
            System.out.println("MD5验证通过");
            return true;
        }
        return false;
    }

    /**
     * 测试
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // String str =
        // "181115.041650.10.88.168.148.2665.2419425653_1";
        String str = "yyp123";
        System.out.println("加密的字符串：" + str + "\t长度：" + str.length());
        MD5Utils.md52(str);
    }
}
