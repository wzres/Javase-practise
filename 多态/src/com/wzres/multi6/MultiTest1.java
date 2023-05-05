package com.wzres.multi6;

/**
 * @ClassName：MultiTest1
 * @description：
 * @date：2023-05-03 11:41
 */
public class MultiTest1 {
    public static void main(String[] args) {
        //向上转型
        Person p = new Student();
        p.doSome();

        //向下转型
        //访问子类特有的方法时，需要向下转型
        if(p instanceof Student){
            Student s = (Student) p;
            s.stuDay();
        }
    }
}

class Person{
    public void doSome(){
        System.out.println("我是人类...");
    }
}

class Student extends Person{
    @Override
    public void doSome() {
        System.out.println("我是学生...");
    }

    public void stuDay(){
        System.out.println("我爱学习..");
    }
}