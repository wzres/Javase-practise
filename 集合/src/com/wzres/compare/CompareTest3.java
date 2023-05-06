package com.wzres.compare;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName：CompareTest3
 * @description：
 * @date：2023-05-06 22:34
 */
public class CompareTest3 {
    public static void main(String[] args) {
        Set<Student> set = new TreeSet<>((o1, o2) -> o1.age-o2.age);
        set.add(new Student(15));
        set.add(new Student(27));
        set.add(new Student(3));
        set.add(new Student(12));


        for (Student student : set) {
            System.out.println(student);
        }
    }
}

class Student{
    int age;

    public Student(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }
}
