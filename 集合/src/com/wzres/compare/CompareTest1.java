package com.wzres.compare;

import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName：CompareTest1
 * @description：实现Comparable方式
 * @date：2023-05-02 18:38
 */
public class CompareTest1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog(10);
        Dog dog2 = new Dog(7);
        Dog dog3 = new Dog(3);

        Set<Dog> treeSet = new TreeSet<>();
        treeSet.add(dog1);
        treeSet.add(dog2);
        treeSet.add(dog3);

        for (Dog dog : treeSet) {
            System.out.println(dog);
        }

    }
}

class Dog implements Comparable<Dog>{
    int age;

    @Override
    public int compareTo(Dog o) {
        return this.age-o.age;
    }

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
