package com.wzres.string3;

import java.util.Arrays;

/**
 * @ClassName StrMethod1
 * @description
 * @date 2023-05-26 11:12
 */
public class StrMethod1 {
    public static void main(String[] args) {
        //1
        System.out.println("aBc".toLowerCase());
        System.out.println("aBc".toUpperCase());

        //2
        System.out.println("  trim ".trim());

        //3
        System.out.println("abc".equalsIgnoreCase("aBC"));

        //4
        System.out.println("combyz".length());

        //5
        System.out.println("abc".contains("a"));

        //6
        System.out.println("www.wzres.com".substring(4, 9));

        //7
        byte[] bytes = "abcd".getBytes();
        System.out.println(Arrays.toString(bytes));

        //8
        System.out.println("".isEmpty());

        //9
        String[] split = "com,wzres,www".split(",");
        System.out.println(Arrays.toString(split));

        String[] split1 = "com".split("-");
        System.out.println(Arrays.toString(split1));

        //10
        String s = String.valueOf(456);
        System.out.println(s);

    }
}
