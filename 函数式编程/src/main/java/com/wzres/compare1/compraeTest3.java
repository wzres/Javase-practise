package com.wzres.compare1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName compraeTest3
 * @description
 * @date 2023-05-28 21:33
 */
public class compraeTest3 {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>(Arrays.asList(99,50,60,20,15,5));
        for (Integer num : s) {
            System.out.println(num);
        }

        Set<Person> s1 = new TreeSet<>(Arrays.asList(new Person(99),new Person(42),new Person(25),new Person(15),new Person(7)));
        for (Person age : s1) {
            System.out.println(age);
        }
    }
}

class Person implements Comparable<Person>{
    Integer age;

    public Person(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.age.compareTo(o.age);
    }


}
