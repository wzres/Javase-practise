package com.wzres.interface12;


/**
 * \
 *
 * @ClassName InterfaceTest1
 * @date 2023-07-01 21:23
 */
public class InterfaceTest1 {
    public static void main(String[] args) {
        Milk m = new Milk();
        m.ice("纯牛奶");

        GreenTea<Boolean> greenTea = new GreenTea<>();
        greenTea.ice(true);
    }
}

interface Freezaable<T>{
    void ice(T t);
}

class Milk implements Freezaable<String>{

    @Override
    public void ice(String s) {
        System.out.println(s);
    }
}

class GreenTea<T> implements Freezaable<T>{

    @Override
    public void ice(T t) {
        System.out.println(t);
    }
}
