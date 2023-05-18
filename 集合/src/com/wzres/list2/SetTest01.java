package com.wzres.list2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName：SetTest01
 * @description：
 * @date：2023-05-09 21:43
 */
public class SetTest01 {
    public static void main(String[] args) {
        //set：无序不可重复
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(75);
        set.add(45);
        set.add(5);
        set.add(5);
        set.add(8);

        for (Integer integer : set) {
            System.out.println(integer);
        }

        //无序不可重复，但会按照大小自动排序

        Set<Integer> set1 = new TreeSet<>();
        set1.add(5);
        set1.add(75);
        set1.add(45);
        set1.add(5);
        set1.add(5);
        set1.add(8);
        for (Integer integer : set1) {
            System.out.println(integer+"--");
        }

    }
}
