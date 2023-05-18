package com.wzres.list3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName ListTest1
 * @description
 * @date 2023-05-15 20:58
 */
public class ListTest1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan",14));
        list.add(new Student("lisi",15));
        list.add(new A("tom", 17));

        for (Student element : list) {
            System.out.println(element);
        }

        List<Integer> list1 = new LinkedList<>();

        list1.add(1);
        list1.add(2);

        for (Integer element : list1) {
            System.out.println(element);
        }



    }
}


class Student{
    String name;
    Integer age;

    public Student() {
    }

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

class A extends Student{
    public A(String name, Integer age) {
        super(name, age);
    }
}