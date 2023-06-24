package com.wzres.ref6;

/**
 * @ClassName RefTest1
 * @date 2023-06-19 17:46
 */
public class RefTest1 {
    public static void main(String[] args) {
        Person<String> person = new Person<>();
        person.test("zhangsan");
        System.out.println(person.name);

        sonPerson s = new sonPerson();
        s.test(98);

        Person<Double> s1 = new sonPerson1<>();
        s1.test(5.0);
    }
}

class Person<T>{
    T name;

    public void test(T t){
        this.name = t;
    }
}


class sonPerson extends Person<Integer>{
    @Override
    public void test(Integer integer) {
        System.out.println(integer);
    }
}

class sonPerson1<T> extends Person<T>{
    @Override
    public void test(T t) {
        System.out.println(t);
    }
}