package com.wzres.list3;

import java.util.*;

/**
 * @ClassName SetTest1
 * @description
 * @date 2023-05-15 21:42
 */
public class SetTest1 {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(8);
        s.add(7);
        s.add(8);
        s.add(10);
        s.add(1);
        s.add(15);
        s.add(17);
        s.add(15);

        for (Integer element : s) {
            System.out.println(element);
        }

        Set<String> s1 = new TreeSet<>();
        s1.add("a");
        s1.add("d");
        s1.add("a");
        s1.add("z");
        s1.add("y");

        for (String element : s1) {
            System.out.println(element);
        }


        List<String> s2 = new ArrayList<>(Arrays.asList("2","a"));

        for (String s3 : s2) {
            System.out.println(s3);
        }
    }
}
