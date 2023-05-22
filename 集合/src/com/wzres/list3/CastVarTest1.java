package com.wzres.list3;

import java.util.*;

/**
 * @ClassName CastVarTest1
 * @description
 * @date 2023-05-21 20:57
 */
public class CastVarTest1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("35", "67", "89");

        System.out.println(list);
       /* for (String s : list) {
            System.out.println(s);
        }*/

        Set<Integer> s = new TreeSet<>();
        s.add(51);
        s.add(19);
        s.add(5);
        s.add(8);
        s.add(3);

        List<Integer> list1 = new ArrayList<>(s);

        for (Integer element : list1) {
            System.out.println(element);
        }
    }
}
