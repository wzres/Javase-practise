package com.wzres.compare1;

import com.wzres.domain.Person;

import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName CompraeTest4
 * @description
 * @date 2023-06-03 23:38
 */
public class CompraeTest4 {
    public static void main(String[] args) {
        Set<Person> s = new TreeSet<>();
        s.add(new Person(45));
        s.add(new Person(35));
        s.add(new Person(12));
        s.add(new Person(17));
        s.add(new Person(10));

        for (Person element : s) {
            System.out.println(element);
        }
    }
}
