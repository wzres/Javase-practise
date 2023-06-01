package com.wzres.list5;

import java.util.*;

/**
 * @ClassName CastVarTest1
 * @description
 * @date 2023-06-01 21:52
 */
public class CastVarTest1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 15,15, 9, 6));
        System.out.println(list);
        /*for (Integer num : list) {
            System.out.println(num);
        }*/

        Set<Integer> set = new TreeSet<>(list);
        for (Integer age : set) {
            System.out.println(age);
        }

        Integer array[] = {1, 9, 15, 15, 9, 6};
        Set<Integer> set1 = new TreeSet<>(Arrays.asList(array));
        for (Integer age : set1) {
            System.out.println(age);
        }


    }
}
