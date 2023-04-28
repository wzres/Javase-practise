package com.wzres.interface1;

/**
 * @ClassName：InterfaceTest1
 * @description：
 * @date：2023-04-26 21:56
 */
public class InterfaceTest1 {
    public static void main(String[] args) {
        Android a = new Android();
        a.test("zhangsan");

        Phone<Integer> p = new Apple<>();
        p.test(123);

    }
}

interface Phone<T>{
    void test(T t);
}

class Android implements Phone<String>{

    @Override
    public void test(String s) {
        System.out.println(s);
    }
}

class Apple<T> implements Phone<T>{

    @Override
    public void test(T t) {
        System.out.println(t);
    }
}
