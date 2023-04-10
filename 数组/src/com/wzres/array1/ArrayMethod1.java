package com.wzres.array1;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName：ArrayMethod1
 * @description：
 * @date：2023-04-10 19:12
 */
public class ArrayMethod1 {
    public static void main(String[] args) {
        int i [] = {35,46,98};
        System.out.println("Arrays.toString(i) = " + Arrays.toString(i));
        Arrays.sort(i);
        System.out.println("Arrays.binarySearch(i,46) = " + Arrays.binarySearch(i, 46));
        List<int[]> ints = Arrays.asList(i);
        System.out.println("ints = " + ints);
    }
}
