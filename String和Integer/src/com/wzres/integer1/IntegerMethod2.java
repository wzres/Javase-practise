package com.wzres.integer1;

/**
 * @ClassName：IntegerMethod2
 * @description：
 * @date：2023-04-13 04:34
 */
public class IntegerMethod2 {
    public static void main(String[] args) {
        // int ➟ Integer
        int i = 10;
        Integer ger = Integer.valueOf(i);
        System.out.println();

        //Integer ➟ int
        int i1 = ger.intValue();
        int i2 = ger;

        //String ➟ int
        int i3 = Integer.parseInt("456");
        System.out.println(i3);

        //int ➟ String
        int o = 4;
        String s = 4 +"";

        String.valueOf(o);

        //String ➟ Integer
        Integer.valueOf("456");

        //Integer ➟ String
        String.valueOf(4);





    }
}
