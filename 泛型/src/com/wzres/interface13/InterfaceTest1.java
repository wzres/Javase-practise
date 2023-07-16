package com.wzres.interface13;

/**
 * @ClassName InterfaceTest1
 * @date 2023-07-13 15:22
 */
public class InterfaceTest1 {
    public static void main(String[] args) {
        Coffee c = new Coffee();
        c.ice(456);

        Freezable<String> f = new Juice<>();
        f.ice("果汁...");
    }
}

interface Freezable<T>{
    void ice(T t);
}

class Coffee implements Freezable<Integer>{

    @Override
    public void ice(Integer integer) {
        System.out.println(integer);
    }
}

class Juice<T> implements Freezable<T>{

    @Override
    public void ice(T t) {
        System.out.println(t);
    }
}

