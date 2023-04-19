package com.wzres.integer1;

/**
 * @ClassName：IntegerObj5
 * @description：
 * @date：2023-04-19 22:36
 */
public class IntegerObj5 {
    public static void main(String[] args) {

        // int ➟ Integer
        Integer i = 35;

        // Integer ➟ int
        int a = i;

        // String ➟ int
        System.out.println(Integer.parseInt("123"));

        // int ➟ String
        int b = 123;
        String s = b + "";

        String s1 = String.valueOf(b);

        //String ➟ Integer
        Integer integer = Integer.valueOf("123");
        Integer x = new Integer("123");

        // Integer ➟ String
        System.out.println(String.valueOf(123));

    }
}
