package com.wzres.multi8;

/**
 * @ClassName MultiTest1
 * @date 2023-06-24 21:43
 */
public class MultiTest1 {
    public static void main(String[] args) {
        Juice juice = new Juice();
        juice.drink();

        Beverage beverage = new Juice();
        beverage.drink();

        Beverage beverage1 = new Cola();
        beverage1.drink();
        Cola cola = (Cola) beverage1;
        cola.taste();

        /*Cola beverage11 = (Cola) beverage;
        beverage11.taste();*/
    }
}

class Beverage{
    public void drink(){
        System.out.println("我在喝饮料");
    }
}

class Juice extends Beverage{
    @Override
    public void drink() {
        System.out.println("我在喝果汁..");
    }

    public void taste(){
        System.out.println("味道很甜...");
    }

}

class Cola extends Beverage{
    @Override
    public void drink() {
        System.out.println("我在喝可乐...");
    }

    public void taste(){
        System.out.println("味道很冰爽");
    }
}
