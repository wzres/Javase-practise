package com.wzres.javase1;


public class interfaceTest{
    public static void main(String[] args) {
        //向上转型
        Computer c = new Asus();
        c.brand();
        c.moder();
    }
}

interface Computer {
    void brand();
    void moder();

}

class Asus implements Computer{
    //重点，类实现接口，必须将方法实现

    @Override
    public void brand() {
        System.out.println("电脑品牌是华硕...");
    }

    @Override
    public void moder() {
        System.out.println("电脑型号是rtx3060");
    }


}
