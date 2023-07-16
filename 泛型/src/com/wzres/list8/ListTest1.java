package com.wzres.list8;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ListTest1
 * @date 2023-07-01 21:29
 */
public class ListTest1 {
    public static void main(String[] args) {


        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student());
        test(list);
    }

    private static void test(List<? extends School> list) {
        System.out.println(list.get(0));
    }
}

class School{

}

class Student extends School{

}