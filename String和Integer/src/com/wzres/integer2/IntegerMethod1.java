package com.wzres.integer2;

/**
 * @ClassName：IntegerMethod1
 * @description：
 * @date：2023-04-29 21:45
 */
public class IntegerMethod1 {
    public static void main(String[] args) {
        // Integer ➟ int

        System.out.println(new Integer(123).intValue());

        // int ➟ Integer
        System.out.println(new Integer(123));
        System.out.println(Integer.valueOf(456));

        //int ➟ String
        int i = 456;
        System.out.println(i + "");
        String.valueOf(i);

        //String ➟ int
        System.out.println(Integer.parseInt("456789"));

        //String ➟ Integer
        System.out.println(Integer.valueOf("789"));

        //Integer ➟ String
        System.out.println(String.valueOf(456));

    }
}
