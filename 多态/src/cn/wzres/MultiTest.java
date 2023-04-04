package cn.wzres;

import java.util.List;

/**
 * @ClassName：MultiTest
 * @description：多态
 * @date：2023-03-29 08:19
 */
public class MultiTest {
    //多态：父类型引用指向子类型对象
    public static void main(String[] args) {
        // 无论是向上转型和向下转型，两种类型之间必须有继承关系，否则编译错误

        //向上转型
        Animal animal = new Cat();
        //编译阶段：
        //编译阶段会查看animal是Animal类型，会看Animal有没有move方法
        //运行阶段：
        // JVM堆内存中创建的真实对象是cat，所以底层调用的一定是cat对象的方法
        animal.move();

        //向下类型
        // animal.clutchMouse(); //编译错误，父类型没有clutchMouse方法

        // 结论：当需要用到子类型特有的方法时，需要用到强制类型转换
        Cat c = (Cat) animal;
        c.clutchMouse();//猫在抓老鼠

    }
}

class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}

class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("猫在走猫步");
    }

    public void clutchMouse(){
        System.out.println("猫在抓老鼠");
    }
}

class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("鸟儿在飞翔");
    }
}