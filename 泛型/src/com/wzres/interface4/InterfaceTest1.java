package com.wzres.interface4;

/**
 * @ClassName：InterfaceTest1
 * @description：
 * @date：2023-05-12 22:13
 */
public class InterfaceTest1 {
    public static void main(String[] args) {
        Phone<Integer> p = new Android<>();
        System.out.println(p.test(123456789));

        Apple a = new Apple();
        System.out.println(a.test("华为"));
    }
}

interface Phone<T>{
    T test(T t);
}

class Android<T> implements Phone<T>{

    @Override
    public T test(T t) {
        return t;
    }
}

class Apple implements Phone<String>{

    @Override
    public String test(String s) {
        return s;
    }
}
