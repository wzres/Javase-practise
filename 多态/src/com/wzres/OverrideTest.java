package com.wzres;

/**
 * @ClassName：Animal
 * @description：方法覆盖
 * @date：2023-03-29 07:52
 */

class Animal {
    public void move(){
        System.out.println("动物在移动...");
    }
}

class Cat extends Animal {
    public void move(){
        System.out.println("猫在走猫步...");
    }
}
 public class OverrideTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.move();
        //结论：方法重写后：访问的一定是子类重写后的方法
    }
}
