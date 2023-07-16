package com.wzres.string3;

import java.util.Arrays;

/**
 * @ClassName StrMothod2
 * @date 2023-06-28 15:28
 */
public class StrMothod2 {
    public static void main(String[] args) {

        //① 大小写
        String str = "Abc".toLowerCase();
        System.out.println(str);

        String str1 = "Abc".toUpperCase();
        System.out.println(str1);

        //② 非空判断
        System.out.println("".isEmpty()); //true

        //③ 去掉前后空白
        System.out.println("        trim".trim());

        //④ 判断是否相等
        System.out.println("abc".equals("ABC")); //false
        System.out.println("abc".equalsIgnoreCase("ABC")); //忽略大小写

        //⑤ 字符串转数组
        byte[] bytes = "savcde".getBytes();
        for (byte element : bytes) {
            System.out.println(element);
        }

        //⑥ 分隔
        String[] element = "s-a-v-c-d-e".split("-");
        System.out.println(Arrays.toString(element));

        //⑦ 拆分
        String substring = "http://www.wzres.com".substring(7);
        System.out.println(substring);
        System.out.println("http://www.wzres.com".substring(11,16));

        //⑧ 数组长度
        int length = "length".length();
        System.out.println(length);

        //⑨ 是否包含
        System.out.println("abcd".contains("a"));

        //⑩ 非字符串转成字符串

        char arrays[] = {'我', '是', '中', '国', '人'};
        System.out.println(String.valueOf(arrays));


    }
}
