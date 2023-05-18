package com.wzres.compare;

import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName CompraeTest2
 * @description
 * @date 2023-05-18 15:39
 */
public class CompraeTest2 {
    public static void main(String[] args) {
        Set<Dog> s = new TreeSet<>((o1, o2) -> o1.age-o2.age);
        s.add(new Dog(10));
        s.add(new Dog(7));
        s.add(new Dog(3));
        s.add(new Dog(5));
        s.add(new Dog(2));

        for (Dog dog : s) {
            System.out.println(dog);
        }
    }
}

class Dog{
    int age;

    public Dog(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }
}
