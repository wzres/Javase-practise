package com.wzres.interface7;

/**
 * @ClassName InterfaceTest1
 * @description
 * @date 2023-06-03 23:30
 */
public class InterfaceTest1 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.test(12356));

        Person<String> p = new Man<>();
        System.out.println(p.test("泛型接口"));
    }
}

interface Person<T>{
    T test(T t);
}

class Student implements Person<Integer>{
    @Override
    public Integer test(Integer integer) {
        return integer;
    }
}

class Man<T> implements Person<T>{

    @Override
    public T test(T t) {
        return t;
    }
}