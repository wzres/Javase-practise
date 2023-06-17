package com.wzres.domain;

import java.util.Comparator;

/**
 * @ClassName Person
 * @description
 * @date 2023-06-03 23:37
 */
public class Person implements Comparable<Person>{
    int age;

    public Person(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
