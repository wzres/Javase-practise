package com.wzres.integer4;

/**
 * @ClassName IntegerTest2
 * @date 2023-06-28 15:48
 */
public class IntegerTest2 {
    public static void main(String[] args) {

        // int ➟ Integer
        Integer i = 98;

        // Integer ➟ int

        int age = i;

        // int ➟ String
        int a = 98;
        String s = a + "";

        String.valueOf(a);

        //String ➟ int

        int i1 = Integer.parseInt("456");

        // String ➟ Integer
        Integer.valueOf("456");
        Integer integer = new Integer("789");

        //Integer ➟ String
        String.valueOf(integer);

    }
}
