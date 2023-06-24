package com.wzres.list7;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @ClassName ListTest2
 * @date 2023-06-23 17:30
 */
public class ListTest2 {
    public static void main(String[] args) {
        //有序可重复
        List<String> s = new ArrayList<>();
        s.add("123");
        s.add("456");
        s.add("789");
        s.add("456");
        s.add("123");

        s.forEach(id -> System.out.println(id));
    }
}
