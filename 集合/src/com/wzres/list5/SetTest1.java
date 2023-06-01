package com.wzres.list5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName SetTest1
 * @description
 * @date 2023-06-01 21:44
 */
public class SetTest1 {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        s.add(87);
        s.add(67);
        s.add(59);
        s.add(32);
        s.add(43);
        s.add(43);
        s.add(5);

        for (Integer num : s) {
            System.out.println(num);
        }

        System.out.println("----");

        Set<Integer> s1 = new HashSet<>();
        s1.add(87);
        s1.add(67);
        s1.add(59);
        s1.add(32);
        s1.add(43);
        s1.add(43);
        s1.add(5);

        Iterator<Integer> iterator = s1.iterator();
        while (iterator.hasNext()){
            Integer num = iterator.next();
            System.out.println(num);
        }

    }
}
