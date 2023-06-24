package com.wzres.string3;

/**
 * @ClassName StringObj2
 * @date 2023-06-23 17:25
 */
public class StringObj2 {
    public static void main(String[] args) {

        //字符串常量池
        String s = "123";
        String d = "123";
        System.out.println(s==d); //true

        String a = new String("abc");
        String b = new String("abc");
        System.out.println(a==b); //false

        System.out.println(a.equals(b)); //true
    }
}
