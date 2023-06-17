package com.wzres.list6;

import java.util.*;

/**
 * @ClassName CastVarTest1
 * @description
 * @date 2023-06-07 17:19
 */
public class CastVarTest1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 55, 47, 8));
        for (Integer num : list) {
            System.out.println(num);
        }

        Set<Integer> s = new TreeSet<>();
        s.add(98);
        s.add(97);
        s.add(96);
        s.add(96);
        s.add(95);
        s.add(1);

        List<Integer> list1 = new ArrayList<>(s);
        for (Integer num : list1) {
            System.out.println(num);
        }

        Integer arr[] = {9,55,23,17};

        List<Integer> list2 = new ArrayList<>(Arrays.asList(arr));


    }
}
