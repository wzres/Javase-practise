package com.wzres.interface6;

/**
 * @ClassName InterfaceTest1
 * @description
 * @date 2023-05-28 21:58
 */
public class InterfaceTest1 {
    public static void main(String[] args) {
        Android a = new Android();
        System.out.println(a.install("华为重装系统..."));

        Phone<String> p1 = new Android();
        System.out.println(p1.install("小米重装系统"));

        Phone<Integer> p = new Apple<>();
        System.out.println(p.install(110));

    }
}

interface Phone<T>{
    T install(T t);
}

class Android implements Phone<String>{

    @Override
    public String install(String s) {
        return s;
    }
}

class Apple<T> implements Phone<T>{

    @Override
    public T install(T t) {
        return t;
    }
}
