package com.wzres.constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ConstryctorTest2
 * @date 2023-07-08 21:55
 */
public class ConstryctorTest2 {
    public static void main(String[] args) {

        // 1 for循环
        List<Integer> number = new ArrayList<>(Arrays.asList(55, 9, 6, 35, 49, 65));
        for (int i = 0; i < number.size(); i++) {
            System.out.println(number.get(i));
        }

        // 2 迭代器
        List<Integer> number2 = new ArrayList<>(Arrays.asList(55, 9, 6, 35, 49, 65));
        Iterator<Integer> iterator = number2.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }

        // 3 增强for循环
        List<Integer> num = new ArrayList<>(Arrays.asList(55, 9, 6, 35, 49, 65));
        for (Integer age : num) {
            System.out.println(age);
        }

        // 4 lambda表达式
        List<Integer> list = new ArrayList<>(Arrays.asList(55, 9, 6, 35, 49, 65));
        list.forEach(item-> System.out.println(item));

        // 5 Stream流
        List elements = new ArrayList(Arrays.asList(55, 9, 6, 35, 49, 65));
        elements.stream()
                .forEach(element-> System.out.println(element));

    }
}

class User{

}
