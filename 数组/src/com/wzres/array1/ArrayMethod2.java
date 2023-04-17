package com.wzres.array1;

import java.util.Arrays;

/**
 * @ClassName：ArrayMethod2
 * @description：
 * @date：2023-04-17 21:31
 */
public class ArrayMethod2 {
    public static void main(String[] args) {
        Integer[] array = {3, 96, 97};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.binarySearch(array, 96));
    }
}
