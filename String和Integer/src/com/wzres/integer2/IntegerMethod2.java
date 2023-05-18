package com.wzres.integer2;

/**
 * @ClassName：IntegerMethod2
 * @description：
 * @date：2023-05-07 21:41
 */
public class IntegerMethod2 {
    public static void main(String[] args) {
        // int ➟ integer

        Integer i = 25;

        //Integer ➟ int

        int i1 = i;

        // String ➟ int
        Integer.parseInt("123");

        //int ➟ String
        int a = 456;
        String s = a + "";

        // String ➟ integer

        Integer i2 = Integer.valueOf("456");

        // Integer ➟ String

        String s1 = String.valueOf(i2);

    }
}
