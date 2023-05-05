package com.wzres.list1;

import java.util.*;

/**
 * @ClassName：CastVarTest1
 * @description：
 * @date：2023-05-03 12:05
 */
public class CastVarTest1 {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>(Arrays.asList(1,2,5));
        System.out.println(s);

        Integer [] arr = {2,3,7};
        System.out.println(Arrays.asList(arr));

        List<Integer> list = new ArrayList<>();
        list.add(55);
        list.add(57);
        list.add(59);
        list.add(10);
        list.add(60);

        Set<Integer> set = new TreeSet<>(list);
        for (Integer element : set) {
            System.out.println(element);
        }


        Set<Integer> set1 = new TreeSet<>();
        set1.add(35);
        set1.add(19);
        set1.add(2);
        set1.add(1);
        set1.add(9);
        set1.add(5);
        set1.add(14);
        set1.add(3);

        List list1 = new ArrayList<>(set1);
        for (Object o : list1) {
            System.out.println(o);
        }

        Collections.sort(list1);


    }


    }


