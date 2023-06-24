package com.wzres.list7;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName SetTest1
 * @date 2023-06-17 18:17
 */
public class SetTest1 {
    public static void main(String[] args) {
        //无序，不可重复，但会自动排序
        Set<Integer> s1 = new TreeSet<>();
        s1.add(95);
        s1.add(97);
        s1.add(82);
        s1.add(35);
        s1.add(35);
        s1.add(15);

        for (Integer num : s1) {
            System.out.println(num);
        }

        System.out.println("--------------");

        //无序，不可重复
        Set<Integer> s2 = new HashSet<>();
        s2.add(95);
        s2.add(97);
        s2.add(82);
        s2.add(82);
        s2.add(35);
        s2.add(15);

        for (Integer num : s2) {
            System.out.println(num);
        }
    }
}
