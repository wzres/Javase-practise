package com.wzres.list6;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName SetTest1
 * @description
 * @date 2023-06-07 17:13
 */
public class SetTest1 {
    public static void main(String[] args) {
        // 无序，不可重复
        Set<Integer> s = new HashSet<>();
        s.add(59);
        s.add(64);
        s.add(25);
        s.add(17);
        s.add(9);
        s.add(9);
        s.add(2);

        for (Integer num : s) {
            System.out.println(num);
        }

        System.out.println("----------");

        Set<Integer> s1 = new TreeSet<>();
        s1.add(59);
        s1.add(64);
        s1.add(25);
        s1.add(17);
        s1.add(9);
        s1.add(9);
        s1.add(2);

        for (Integer num : s1) {
            System.out.println(num);
        }
    }
}
