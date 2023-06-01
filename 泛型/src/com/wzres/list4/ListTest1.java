package com.wzres.list4;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ListTest1
 * @description
 * @date 2023-05-28 22:06
 */
public class ListTest1 {
    public static void main(String[] args) {
        List<person> p = new ArrayList<>();
        p.add(new person(54));
        p.add(new person(17));
        p.add(new person(9));
        p.add(new Student(31));
        test(p);

        List<Student> s = new ArrayList<>();
        s.add(new Student(52));
        s.add(new Student(32));
        s.add(new Student(12));

        test(s);
    }

    private static void test(List<? extends person> l) {
        for (person person : l) {
            System.out.println(person);
        }
    }
}

class person{
    Integer age;

    public person() {
    }

    public person(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "age=" + age +
                '}';
    }
}

class Student extends person{

    public Student(Integer age) {
        super(age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }
}
