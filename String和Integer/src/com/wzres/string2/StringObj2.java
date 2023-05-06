package com.wzres.string2;

/**
 * @ClassName：StringObj2
 * @description：
 * @date：2023-05-06 10:11
 */
public class StringObj2 {
    public static void main(String[] args) {

        String x = "123";
        String y = "123";
        System.out.println(x == y); //true

        String s1 = new String("123");
        String s2 = new String("123");
        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2));

        byte b [] = {97,98,99};
        String str1 = new String(b);
        System.out.println(str1);

        char c [] = {'中','国',97};
        String str2 = new String(c);
        System.out.println(str2); //中国a
    }
}
