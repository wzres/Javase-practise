package com.wzres.integer3;

/**
 * @ClassName IntegerMethod1
 * @description
 * @date 2023-05-28 22:15
 */
public class IntegerMethod1 {
    public static void main(String[] args) {
        // int ➟ Integer

        Integer.valueOf(5);

        Integer s = 456;

        // Integer ➟ int

        int num  = s;

        // int ➟ String

        String age = 4 + "";

        String.valueOf(5);

        // String ➟ int

        int age1 = Integer.parseInt("789");

        // String ➟ Integer

        Integer.valueOf("456");

        Integer i = new Integer("789");

        // Integer ➟ String

        String.valueOf(new Integer(5));


    }
}
