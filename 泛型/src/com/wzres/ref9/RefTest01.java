package com.wzres.ref9;

/**
 * @ClassName RefTest01
 * @date 2023-07-13 15:16
 */
public class RefTest01 {
    public static void main(String[] args) {
        Beverage<Coffee> b = new Beverage<>();
        Coffee c = new Coffee();
        b.drink(c);

        Juice j = new Juice();
        j.drink("可乐");

        Milk<String> m = new Milk<>();
        m.drink("牛奶");

    }
}

class Beverage<T>{
    T type;
    public void drink(T t){
        System.out.println(t);
    }
}

class Juice extends Beverage<String>{
    @Override
    public void drink(String s) {
        System.out.println(s);
    }
}

class Milk<T> extends Beverage<T>{
    @Override
    public void drink(T t) {
        System.out.println(t);
    }
}

class Coffee{

}
