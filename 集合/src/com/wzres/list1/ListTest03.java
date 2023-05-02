package com.wzres.list1;

import java.util.*;

/**
 * @ClassName：ListTest03
 * @description：
 * @date：2023-05-01 22:41
 */
public class ListTest03 {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.add("123");
        s.add("你好");
        s.add("123");
        s.add("早上好");

        //①
        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

        //②
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }

        //③
        for (String element : s) {
            System.out.println(element);
        }


    }
}
