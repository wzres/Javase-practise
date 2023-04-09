package com.wzres.string1;

/**
 * @ClassName：StrOBj
 * @description：
 * @date：2023-04-05 03:20
 */
public class StringObj1 {

    public static void main(String[] args) {
        String s1 = "123"; //字符串常量池创建
        String s2 = "123"; //字符串常量池创建

        System.out.println(s1==s2);//true

        String x = new String("abc"); //堆和字符串常量池创建
        String y = new String("abc"); //堆和字符串常量池创建
        System.out.println(x==y); //false
        System.out.println(x.equals(y)); //true

    }
}
