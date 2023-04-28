package com.wzres.ref1;

/**
 * @ClassName：Test1
 * @description：
 * @date：2023-04-26 21:43
 */
public class RefTest1 {
    public static void main(String[] args) {
        Hello<String> hello = new Hello<>();
        hello.usename = "zhangsan";
        hello.test(hello.usename);

        SonHello1 sonHello = new SonHello1();
        sonHello.test(123);

        Hello<Boolean> h = new SonHello2<>();
        h.test(true);
    }
}

class Hello<T>{
    T usename;

    public void test(T t){
        System.out.println(t);
    }
}

class SonHello1 extends Hello<Integer>{
    @Override
    public void test(Integer integer) {
        System.out.println(integer);
    }
}

class SonHello2<T> extends  Hello<T>{
    @Override
    public void test(T t) {
        System.out.println(t);
    }
}

