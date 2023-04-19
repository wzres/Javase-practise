package com.wzres.string1;

/**
 * @ClassName：StringObj5
 * @description：
 * @date：2023-04-18 21:36
 */
public class StringObj5 {
    public static void main(String[] args) {
        String s = "123";
        String y = "123";
        System.out.println(s==y); //true

        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1==s2); //faalse
        // String重写了toString
        System.out.println(s1);
        // String重写了equals
        System.out.println(s1.equals(s2)); //true

    }
}
