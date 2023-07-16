package com.wzres.override4;

/**
 * @ClassName ExtendsTest1
 * @date 2023-07-09 22:39
 */
public class ExtendsTest1 {
    public static void main(String[] args) {
        Cola c = new Cola();
        c.setSize("大瓶");
        c.drink();

        Coffee c1 = new Coffee();
        c1.setSize("小瓶");
        c1.drink();
    }
}


class Beverage {

    private  String size;

    public void drink() {
        System.out.println("喝饮料");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

class Cola extends Beverage{
    @Override
    public void drink() {
        System.out.println("喝"+getSize()+"可乐...");
    }
}

class Coffee extends Beverage{

    @Override
    public void drink() {
        System.out.println("喝"+getSize()+"拿铁...");
    }
}
