package com.wzres.string1;

import java.util.Arrays;

/**
 * @ClassName：StrMethod3
 * @description：
 * @date：2023-04-13 04:20
 */
public class StrMethod3 {
    public static void main(String[] args) {
        String s1 = "abC".toLowerCase();
        System.out.println("s1 = " + s1);
        String s2 = "abC".toUpperCase();
        System.out.println("s2 = " + s2);

        int length = "sdsaesoem".length();
        System.out.println("length = " + length);

        String str1 = "abC";
        String str2 = "abc";
        System.out.println(str1.equals(str2));
        //比较字符串是否相等，忽略大小写
        System.out.println(str1.equalsIgnoreCase(str2));

        //裁切字符串，从1开始计数，到7开始截断
        System.out.println("http://www.baidu.com".substring(7));
        //裁切字符串，从1开始计数，到7开始截断保留到16
        System.out.println("http://www.baidu.com".substring(7,16));

        String s = "abcdef";
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));

        String x = "我是中国人";
        char[] chars = x.toCharArray();
        System.out.println(Arrays.toString(chars));

        String y = "                                http".trim();
        System.out.println("y = " + y);

        System.out.println("http://www.baidu.com".contains("www")); //true
        System.out.println("http://www.baidu.com".contains("wwwbaidu")); //false

        String z = "";
        System.out.println(z.isEmpty()); //true

        System.out.println(String.valueOf(1));

    }


}
