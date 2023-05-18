package com.wzres.string1;

import java.util.Arrays;

/**
 * @ClassName：StrMethod5
 * @description：
 * @date：2023-05-07 21:48
 */
public class StrMethod5 {
    public static void main(String[] args) {
        // ①String 大小写转换
        String s = "AaA".toLowerCase();
        System.out.println(s);
        System.out.println("AaA".toUpperCase());

        //②
        System.out.println("".isEmpty());

        //③
        System.out.println("   trim ".trim());

        // ④
        System.out.println("http".length());

        //⑤
        System.out.println("abc".equals("Abc")); //false
        System.out.println("abc".equalsIgnoreCase("Abc"));//true

        //⑥
        "http.com".substring(5,8); //com

        //⑦
        System.out.println("http".contains("https")+"不包含");

        //⑧
        byte [] bytes ={97,98,99};
        String x = new String(bytes);

        //⑨
        String[] split = "ht-ea-cd-pl".split("-");
        System.out.println(Arrays.toString(split));

        //⑩
        String.valueOf(456);







    }
}
