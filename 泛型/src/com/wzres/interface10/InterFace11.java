package com.wzres.interface10;


/**
 * @ClassName InterFace11
 * @date 2023-06-28 00:06
 */
public class InterFace11 {
    public static void main(String[] args) {
        Juice<Juice> juice = new Juice<>();
        System.out.println(juice.ice(new Juice()));

        Cola c = new Cola();
        System.out.println(c.ice(new Milk()));
    }
}


interface Freezable<T>{
    T ice(T t);
}

class Juice<T> implements Freezable<T>{

    @Override
    public T ice(T t) {
        return t;
    }
}

class Milk {

}

class Cola implements Freezable<Milk>{

    @Override
    public Milk ice(Milk milk) {
        return milk;
    }
}
