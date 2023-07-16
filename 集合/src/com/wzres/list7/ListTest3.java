package com.wzres.list7;

import java.util.*;

/**
 * @ClassName ListTest3
 * @date 2023-07-08 21:23
 */
public class ListTest3 {
    public static void main(String[] args) {
        //有序可重复
        List<Integer> list =new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(10);

        for (Integer element : list) {
            System.out.println(element);
        }

        //无序不可重复，但会自动排序
        Set<String> set = new TreeSet<>();
        set.add("zhangsan");
        set.add("lisi");
        set.add("wangwu");
        set.add("zhaoliu");
        set.add("wangba");
        set.forEach(item-> System.out.println(item));

        System.out.println("-------------------------");

        //无序不可重复

        Set<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(7);
        set1.add(9);
        set1.add(10);
        set1.add(10);
        set1.add(13);
        set1.add(19);

        set1.forEach(item-> System.out.println(item));


    }
}
