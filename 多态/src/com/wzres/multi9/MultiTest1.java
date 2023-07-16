package com.wzres.multi9;

/**
 * @ClassName MultiTest1
 * @date 2023-07-13 15:45
 */
public class MultiTest1 {
    public static void main(String[] args) {
       /* Beverage b = new Juice();
        b.drink();
      *//*  Juice juice = (Juice) b;
        juice.taste();*//*
        Cola cola = (Cola) b;
        cola.drink();*/

        Beverage be = new Cola();
        Cola be1 = (Cola) be;
        be1.drink();
        be1.ice();
    }
}

class Beverage{
    public void drink(){
        System.out.println("喝饮料...");
    }
}

class Juice extends Beverage{
    @Override
    public void drink() {
        System.out.println("喝果汁...");
    }

    /*public void taste(){
        System.out.println("果汁很酸...");
    }*/
}

class Cola extends Beverage{
    @Override
    public void drink() {
        System.out.println("喝可乐...");
    }

    public void ice(){
        System.out.println("可乐很冰...");
    }
}