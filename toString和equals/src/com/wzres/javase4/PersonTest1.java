package com.wzres.javase4;

import java.util.Objects;

/**
 * @ClassName PersonTest1
 * @description
 * @date 2023-05-18 15:44
 */
public class PersonTest1 {
    public static void main(String[] args) {
        Person p1 = new Person("zhangsan",14);
        Person p2 = new Person("zhangsan",14);

        System.out.println("比较两个对象的内存地址是否相等："+(p1==p2));//false

        boolean equals = p1.equals(p2);
        System.out.println("比较两个对象内容是否相等："+equals);

        System.out.println(p1);
        System.out.println(p2);


    }
}

class Person{
    String name;
    Integer age;

    public Person(String name, Integer age) {
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
        return Objects.equals(name, person.name) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
