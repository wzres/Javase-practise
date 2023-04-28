package com.wzres.override2;

/**
 * @ClassName：OverrideTest1
 * @description：
 * @date：2023-04-24 21:44
 */
public class OverrideTest1 {

    public static void main(String[] args) {
        Student s = new Student();
        //什么时候使用方法覆盖
        //当父类的方法无法满足子类的业务需求时，需要将父类的方法重写
        s.human();
    }
}

class Person{
    public void human(){
        System.out.println("我是人类");
    }
}

class Student extends Person{

    @Override
    public void human() {
        System.out.println("我是学生");
    }
}
