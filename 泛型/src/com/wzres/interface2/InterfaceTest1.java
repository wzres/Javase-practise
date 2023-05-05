package com.wzres.interface2;

/**
 * @ClassName：InterfaceTest1
 * @description：
 * @date：2023-05-05 21:23
 */
public class InterfaceTest1 {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.test());

        Human<Integer> i = new Man<>();
        i.hello(Integer.valueOf("456"));
    }

}

interface Student<T>{
    T test();
}

class Person implements Student<String>{

    @Override
    public String test() {
        return "123";
    }
}

interface Human<T>{
    void hello(T t);
}

class Man<T> implements Human<T>{

    @Override
    public void hello(T t) {
        System.out.println(t);
    }
}