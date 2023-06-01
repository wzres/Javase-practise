package com.wzres.list5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LIstTest
 * @description
 * @date 2023-06-01 21:41
 */
public class LIstTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(87);
        list.add(67);
        list.add(59);
        list.add(32);
        list.add(43);
        list.add(43);
        list.add(5);

        for (Integer num : list) {
            System.out.println(num);
        }

        System.out.println("--------------");

        List<Integer> list1 = new LinkedList<>();
        list1.add(87);
        list1.add(67);
        list1.add(59);
        list1.add(32);
        list1.add(43);
        list1.add(43);
        list1.add(5);

        for (Integer age : list1) {
            System.out.println(age);
        }
    }
}
