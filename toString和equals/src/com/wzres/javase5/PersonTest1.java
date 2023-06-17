package com.wzres.javase5;

import java.util.Objects;

/**
 * @ClassName PersonTest1
 * @date 2023-06-17 18:10
 */
public class PersonTest1 {
    public static void main(String[] args) {
        Person p1 = new Person("zhangsan", 19);
        Person p2 = new Person("zhangsan", 19);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1==p2); //false

        System.out.println(p1.equals(p2));
    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

}
