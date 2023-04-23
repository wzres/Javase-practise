package com.wzres.collection1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName：SetTest01
 * @description：
 * @date：2023-04-22 17:15
 */
public class SetTest01 {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add(1);
        s.add(20);
        s.add(5);
        s.add(3);
        s.add(5);
        s.add(7);
        s.add(10);

        for (Object o : s) {
            System.out.println(o);
        }

        System.out.println("----------------------------");

        Set mySet = new TreeSet();
        mySet.add(1);
        mySet.add(20);
        mySet.add(5);
        mySet.add(3);
        mySet.add(5);
        mySet.add(7);
        mySet.add(10);

        for (Object x : mySet) {
            System.out.println(x);
        }

        /*
        1
        3
        5
        7
        10
        */

    }
}
