package com.wzres.compare1;

import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName CompareTest1
 * @description
 * @date 2023-05-18 15:27
 */
public class CompareTest1 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(92);
        set.add(15);
        set.add(3);
        set.add(7);
        set.add(9);

        for (Integer element : set) {
            System.out.println(element);
        }


        Set<Student> s = new TreeSet<>();
        s.add(new Student(14, "zhangSan"));
        s.add(new Student(17, "lisi"));
        s.add(new Student(17, "tom"));
        s.add(new Student(57, "lucy"));
        s.add(new Student(97, "jack"));

        for (Student element : s) {
            System.out.println(element);
        }



    }
}

class Student implements Comparable<Student>{
    private Integer age;
    private String username;

    public Student(Integer age, String username) {
        this.age = age;
        this.username = username;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", username='" + username + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.age == o.age){
            return this.username.compareTo(o.username);
        } else return this.age - o.age;
    }
}


