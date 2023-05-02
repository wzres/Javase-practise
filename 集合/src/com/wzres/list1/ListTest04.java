package com.wzres.list1;

import java.util.*;

/**
 * @ClassName：ListTest04
 * @description：
 * @date：2023-05-02 17:02
 */
public class ListTest04 {
    public static void main(String[] args) {
        // 特点：有序可重复
        test1();
        test2();


    }

    private static void test2() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(13);
        list.add(4);
        list.add(25);
        list.add(6);

        Set<Integer> set = new TreeSet<>(list);
        for (Integer integer : set) {
            System.out.println(integer);
        }


    }

    private static void test1() {
        List<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("xiaoming");
        list.add("tom");
        list.add("jack");
        list.add("jeff");
        list.add("lisi");

        System.out.println(list.size());

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);

        }

        for (String s : list) {
            System.out.println(s);
        }
    }

}
