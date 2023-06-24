package com.wzres.list7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName LIstTest1
 * @date 2023-06-17 18:15
 */
public class LIstTest1 {
    public static void main(String[] args) {
        //有序可重复
        List<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("zhangsan");
        list.add("wangwu");

        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("----------------");

        List<String> list1 = new LinkedList<>();
        list1.add("zhangsan");
        list1.add("lisi");
        list1.add("zhangsan");
        list1.add("wangwu");

        for (String name : list1) {
            System.out.println(name);
        }
    }
}
