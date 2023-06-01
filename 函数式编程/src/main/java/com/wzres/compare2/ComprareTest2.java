package com.wzres.compare2;

import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName ComprareTest2
 * @description
 * @date 2023-05-28 21:38
 */
public class ComprareTest2 {
    public static void main(String[] args) {
        Set<Outer> s = new TreeSet<>((o1, o2) -> o1.age- o2.age);
        s.add(new Outer(91));
        s.add(new Outer(38));
        s.add(new Outer(25));
        s.add(new Outer(19));
        s.add(new Outer(16));
        s.add(new Outer(5));
        for (Outer age : s) {
            System.out.println(age);
        }

    }
}

class Outer{
    int age;

    public Outer(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Outer{" +
                "age=" + age +
                '}';
    }
}
