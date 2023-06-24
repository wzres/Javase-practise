package com.wzres.constructor;

import java.util.*;

/**
 * @ClassName ConstryctorTest1
 * @date 2023-06-23 18:11
 */
public class ConstryctorTest1 {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>(Arrays.asList(5, 9, 10, 60, 70, 60));
        s.forEach(age-> System.out.println(age));


        Set<Integer> set = new HashSet<>(Arrays.asList(5, 9, 10, 60, 70, 60));
        set.forEach(age-> System.out.println(age));

        Set<Integer> set1 = new TreeSet<>(Arrays.asList(5, 9, 10, 60, 70, 60));
        set1.forEach(age-> System.out.println(age+"--"));


        Integer[] arrays = {5, 9, 10, 60, 70, 60};
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(arrays));
        for (Integer num : set2) {
            System.out.println(num);
        }

    }
}
