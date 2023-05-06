package com.wzres.interface3;

/**
 * @ClassName：InterfaceTest1
 * @description：
 * @date：2023-05-06 09:58
 */
public class InterfaceTest1 {
    public static void main(String[] args) {
        Android<String> a = new PhoneSystem<>();
        System.out.println(a.test("123"));


    }
}

interface Android<T>{
    T test(T t);
}

class PhoneSystem<T> implements Android<T>{

    @Override
    public T test(T t) {
        return t;
    }
}