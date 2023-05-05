package com.wzres.array2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName：ArrayTest3
 * @description：
 * @date：2023-05-05 20:58
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        Integer[] arr = {1,57, 9, 18};
        Arrays.sort(arr);
        for (Integer element : arr) {
            System.out.println(element);

        }
        System.out.println(Arrays.binarySearch(arr, 57));

        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
    }
}
