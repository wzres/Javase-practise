package com.wzres.string1;

/**
 * @ClassName：StringObj4
 * @description：==和equals
 * @date：2023-04-11 04:19
 */
public class StringObj4 {
    public static void main(String[] args) {
        String s1 = "456";
        String s2 = "456";
        System.out.println(s1==s2); //true

        String a = new String("xyz");
        String b = new String("xyz");
        System.out.println(a==b); //false

        //比较对象内容是否相等，不能用==号，==号比较的是对象的内存地址，应该用equals，String重写了equals方法
        System.out.println(a.equals(b)); //true
    }
}
