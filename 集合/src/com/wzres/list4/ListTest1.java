package com.wzres.list4;

import java.util.*;

/**
 * @ClassName ListTest1
 * @description
 * @date 2023-05-21 20:46
 */
public class ListTest1 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",17);
        Student s2 = new Student("lisi",18);
        Student s3 = new Student("wangwu",19);
        Student s4 = new Student("zhaoliu",20);
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);


        for (Student element : list) {
            System.out.println(element);
        }


        Set<Integer> s = new HashSet<>();
        s.add(5);
        s.add(15);
        s.add(27);
        s.add(2);
        s.add(2);
        s.add(1);

        for (Integer num : s) {
            System.out.println(num);
        }

        Set<String> set = new TreeSet<>();

        set.add("tom");
        set.add("zhangsan");
        set.add("zhaoliu");
        set.add("lisi");

        for (String str : set) {
            System.out.println(str);
        }





    }
}

class Student{
    String name;
    Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
