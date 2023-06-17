package com.wzres.multi8;

/**
 * @ClassName Student
 * @date 2023-06-12 15:43
 */
public class Person {
    public void dev(){
        System.out.println("我是一个人类...");
    }
}

class Student extends Person{
    @Override
    public void dev() {
        System.out.println("我是一名学生...");
    }

    public void stuDay(){
        System.out.println("我在学习...");
    }
}

class Teacher extends Person{

    @Override
    public void dev() {
        System.out.println("我是一名教师");
    }

    public void teach(){
        System.out.println("我在教书");
    }
}