package com.wzres.list6;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ListTest1
 * @description
 * @date 2023-06-07 17:12
 */
public class ListTest1 {
    public static void main(String[] args) {
        // 有序，可重复
        List<Integer> s = new ArrayList<>();
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
    }
}

