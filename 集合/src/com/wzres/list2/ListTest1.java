package com.wzres.list2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName：ListTest1
 * @description：
 * @date：2023-05-09 21:39
 */
public class ListTest1 {
    public static void main(String[] args) {
        //list集合：有序可重复
        List<String> list = new ArrayList<>();
        list.add("tom");
        list.add("jack");
        list.add("zhangsan");
        list.add("zhangsan");
        list.add("jeff");
        list.add("lucy");

        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        for (String s : list) {
            System.out.println(s);
        }

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);

        }

        List<Integer> list1 = new ArrayList<>(Arrays.asList(2,8,9));
        System.out.println(list1);
        for (Integer integer : list1) {
            System.out.println(integer);
        }
    }
}
