package com.wzres.interface2;

/**
 * @ClassName：interfaceTest1
 * @description：
 * @date：2023-04-25 21:45
 */
public class interfaceTest1 {
    public static void main(String[] args) {
        Wing w = new Cat();
        w.wing();
    }
}

interface Wing{
    void wing();
}

class Cat implements Wing{

    @Override
    public void wing() {
        System.out.println("飞猫警长...");
    }
}
