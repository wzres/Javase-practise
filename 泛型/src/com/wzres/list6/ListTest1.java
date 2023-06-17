package com.wzres.list6;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ListTest1
 * @date 2023-06-17 16:53
 */
public class ListTest1 {
    public static void main(String[] args) {
        //List<Person> p = new ArrayList<>(Arrays.asList(new Person(16),new Person(19),new Student(34)));
        //primary(p);
        List<Student> s = new ArrayList<>(Arrays.asList(new Student(15)));
        primary(s);
    }

    public static void primary(List< ? extends Person> list){
        System.out.println(list.get(0));
        //System.out.println(list.get(1));
        //System.out.println(list.get(2));
    }
}

class Person{
    int age;

    public Person() {
    }

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}

class Student extends Person{
    public Student(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }
}
