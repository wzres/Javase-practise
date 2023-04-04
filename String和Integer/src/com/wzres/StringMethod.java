package com.wzres;

import java.util.Arrays;

/**
 * @ClassName：StringMethod
 * @description：
 * @date：2023-04-02 23:54
 */
public class StringMethod {
    public static void main(String[] args) {
        // 大小写
        String s = "syR".toLowerCase();
        System.out.println("s = " + s); //syr
        String s1 = "syR".toUpperCase();
        System.out.println("s1 = " + s1); //SYR

        // 去除前后空白？
        String trim = "itrm           ".trim();
        System.out.println("trim = " + trim);

        //判断是否为空
        String x = "";
        System.out.println("x.isEmpty() = " + x.isEmpty()); //true

        //判断2个字符串是否相等//忽略大小写
        boolean abc = "aBc".equalsIgnoreCase("abc");
        System.out.println("abc = " + abc);//true

        // 字符串长度
        int length = "StrString".length();
        System.out.println("length = " + length); //9

        // 字符串截断
        String substring = "www.School.com".substring(4);
        System.out.println("substring = " + substring); //School.com
        System.out.println("www.baidu.com".substring(4,9)); //baidu

        // 包含
        System.out.println("commodity".contains("com")); //true
        System.out.println("commodity".contains("con")); //false

        //转换成数组
        byte[] bytes = "abcefghijk".getBytes();
        System.out.println(Arrays.toString(bytes));

        // 非字符串转换成字符串
        String s2 = String.valueOf(123);
        System.out.println("s2 = " + s2);
        System.out.println(s2 instanceof String);

    }
}
