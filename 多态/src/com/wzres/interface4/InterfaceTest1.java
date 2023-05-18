package com.wzres.interface4;

/**
 * @ClassName InterfaceTest1
 * @description
 * @date 2023-05-16 21:04
 */
public class InterfaceTest1 {
    public static void main(String[] args) {
        // 多态：面向接口编程
        Electricity e = new Bulb();
        e.charge();

        if(e instanceof Bulb){
            Bulb b = (Bulb) e;
            b.discard();
        }


    }
}


interface  Electricity{
    void charge();
}

//一个类实现接口，必须将接口的抽象方法全部实现
class Bulb implements Electricity{

    @Override
    public void charge() {
        System.out.println("电灯泡亮了...");
    }

    public void discard(){
        System.out.println("电灯泡坏了...");
    }
}