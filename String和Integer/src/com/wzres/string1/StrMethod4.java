package com.wzres.string1;

import java.util.Arrays;

/**
 * @ClassName：StrMethod4
 * @description：
 * @date：2023-04-19 22:20
 */
public class StrMethod4 {
    public static void main(String[] args) {
        // ① 判断是否为空字符串
        System.out.println("   ".isEmpty());

        // ② 去除前后红白
        System.out.println("          str   ".trim());

        // ③ 字符串切割
        System.out.println("http://baidu.com".substring(7));

        //  字符串切割
        System.out.println("http://baidu.com".substring(7, 12));

        // ④ 字符串大小写
        // 小写
        System.out.println("Abc".toLowerCase());
        // 大写
        System.out.println("Abc".toUpperCase());

        // ⑤ 字符串是否相等
        System.out.println("Abc".equalsIgnoreCase("abc"));

        // ⑥ 字符串长度
        System.out.println("String".length());

        // ⑦ 字符串转换成数组

        char[] chars = "abcde".toCharArray();
        System.out.println(Arrays.toString(chars));

        byte[] bytes = "abcde".getBytes();
        System.out.println(Arrays.toString(bytes));

        // ⑧ 字符串是否包含
        System.out.println("Abcg".contains("Abc"));

        // ⑨ 非String转换成String
        System.out.println(String.valueOf(123));
    }
}
