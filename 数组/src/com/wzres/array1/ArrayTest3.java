package com.wzres.array1;

/**
 * @ClassName：ArrayTest3
 * @description：
 * @date：2023-04-17 21:28
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        Integer[] array1 = {1, 35, 67};
        for (Integer integer : array1) {
            System.out.println(integer);
        }

        String[] array2 = new String[5];
        array2[0] = "jack";
        array2[1] = "tom";
        array2[2] = "jeff";
        array2[3] = "lucy";

        for (String s : array2) {
            System.out.println(s);
        }
    }

}
