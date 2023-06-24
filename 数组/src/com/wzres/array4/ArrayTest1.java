package com.wzres.array4;

import com.wzres.Student;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ArrayTest1
 * @date 2023-06-19 17:01
 */
public class ArrayTest1 {
    public static void main(String[] args) {

        //静态初始化数组
        int[] a = {57, 98, 65};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //动态初始化数组
        String[] s = new String[4];

        s[0] = "zhangsan";
        s[1] = "wangwu";
        s[2] = "lisi";
        s[3] = "wangba";
        //s[4] = "sds";
        //s[5] = "sww";

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }


        Student[] students = {new Student("zhangsan", 65), new Student("wangwu", 47)};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].stuDay());

        }

        Integer i[] = {65, 97, 88, 56, 93, 5, 2};

        Arrays.sort(i);

        /*for (Integer num : i) {
            System.out.println(num);
        }*/

        System.out.println(Arrays.binarySearch(i,65));

        //List<Integer> list = Arrays.asList(i);
        //System.out.println(list);
        System.out.println(Arrays.toString(i));


    }
}
