package com.wzres.method;

/**
 * @ClassName：MethodTest2
 * @description：
 * @date：2023-05-05 21:36
 */
public class MethodTest2 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.test("456"));
    }
}

class Person{
    public <T> T test(T t){
        return t;
    }
}