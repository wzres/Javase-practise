package com.wzres.string3;

/**
 * @ClassName StringObj1
 * @description
 * @date 2023-05-24 20:35
 */
public class StringObj1 {
    public static void main(String[] args) {
        String s1 = new String("zhangsan");
        String s2 = new String("zhangsan");


        System.out.println(s1 == s2); //false

        String x = "中国人";
        String y = "中国人";

        System.out.println(x == y); //true
        // String重写了toString
        System.out.println(x); //中国人

        byte[] bytes = {97, 98, 99};

        String s3 = new String(bytes);

        System.out.println(s3);

    }
}
