package com.wzres.list1;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName：SetTest03
 * @description：
 * @date：2023-05-02 17:13
 */
public class SetTest03 {
    //无序不可重复，但可以按照大小自动排序

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 14;

        Person p2 = new Person();
        p2.age = 17;

        Person p3 = new Person();
        p3.age = 90;

        Person p4 = new Person();
        p4.age = 7;

        Set<Person> s = new TreeSet<>();
        s.add(p1);
        s.add(p2);
        s.add(p3);
        s.add(p4);

        for (Person person : s) {
            System.out.println(person);
        }

    }

}

class Person implements Comparable<Person>{
    Integer age;

    @Override
    public int compareTo(Person o) {
        //年龄是Integer，可以直接比。调用compareTo来完成比较。
        return this.age.compareTo(o.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
