package com.wzres.compare2;

import com.wzres.domain.Dog;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName ComPrareTest3
 * @description
 * @date 2023-06-03 23:47
 */
public class ComPrareTest3 {
    public static void main(String[] args) {
        Set<Dog> s = new TreeSet<>((o1, o2) -> o1.age - o2.age);
        s.add(new Dog(34));
        s.add(new Dog(54));
        s.add(new Dog(64));
        s.add(new Dog(14));
        s.add(new Dog(7));
        s.add(new Dog(4));

        for (Dog element : s) {
            System.out.println(element);

        }

        Set<A> set = new TreeSet<>((o1, o2) -> o1.age -o2.age);
    }
}

class A{
    int age;
}
