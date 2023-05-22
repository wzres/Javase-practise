package com.wzres.array3;

import com.wzres.Student;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ArratTest1
 * @description
 * @date 2023-05-22 20:44
 */
public class ArratTest1 {
    public static void main(String[] args) {

        Integer[] arr1 = {65, 87, 5, 19, 20, 35};
        List<Integer> list = Arrays.asList(arr1);

        System.out.println(list);


        Arrays.sort(arr1);

        for (int i : arr1) {
            System.out.println(i);
        }

        System.out.println(Arrays.binarySearch(arr1, 87));


        int[] arr = new int[5];
        arr[0] = 5;

        for (int element : arr) {
            System.out.println(element);
        }

        Student s1 = new Student("zhangsan",15);
        Student s2 = new Student("lisi",17);

        Student s[] = {s1, s2};

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].stuDay());

        }


        //test(s);
        hello(new String[]{"a","b","c"});
    }

    private static void hello(String [] strArray) {
        for (String s : strArray) {
            byte[] bytes = s.getBytes();
            System.out.println(Arrays.toString(bytes));
        }
    }

    /*private static void test(Student [] array) {
        for (Student student : array) {
            System.out.println(student);
        }*/
    }
