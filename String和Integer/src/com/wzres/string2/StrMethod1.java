package com.wzres.string2;

import java.util.Arrays;

/**
 * @ClassName：StrMethod5
 * @description：
 * @date：2023-04-29 21:34
 */
public class StrMethod1 {
    public static void main(String[] args) {

        //①
        System.out.println("aBc".toLowerCase());
        System.out.println("aBc".toUpperCase());

        //②
        System.out.println("".isEmpty());

        //③
        System.out.println("abc".equalsIgnoreCase("Abc"));
        System.out.println("abc".equals("Abc"));

        //④
        System.out.println("我要做你床头的小熊".length());

        //⑤
        System.out.println("http://baidu.com".substring(7,12));

        //⑥
        System.out.println("Abc".contains("B"));
        System.out.println("Abc".contains("b"));

        //⑦
        System.out.println("    it  ".trim());

        //⑧
        byte[] bytes = "abc".getBytes();
        System.out.println(Arrays.toString(bytes));

        char[] chars = "abc".toCharArray();
        System.out.println(Arrays.toString(chars));

        //⑨
        System.out.println(String.valueOf(123));

    }
}
