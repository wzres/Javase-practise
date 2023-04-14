package com.wzres.override1;

/**
 * @ClassName：ComputerTest
 * @description：
 * @date：2023-04-08 07:50
 */
public class OverrideTest4 {
    public static void main(String[] args) {
        Asus a = new Asus();

        a.brand();
    }
}

class Computer{
    public void brand(){

    }
}

class Asus extends Computer{

    // 方法覆盖，访问子类特有的方法
    @Override
    public void brand() {
        System.out.println("华硕品牌");
    }
}
