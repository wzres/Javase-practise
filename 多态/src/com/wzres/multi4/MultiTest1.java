package com.wzres.multi4;

/**
 * @ClassName：MultiTest1
 * @description：
 * @date：2023-04-16 06:31
 */
public class MultiTest1 {
    public static void main(String[] args) {
        //父类下引用指向子类型对象
        //向上转型
        School s = new Student();
        s.studay();
        //向下转型
        //当访问子类特有的方法，需要向下转型
        if(s instanceof Student){ //动态判断引用指向的类型是不是Student
            Student student = (Student) s;
            student.hobby();
        }


    }
}

class School{
    public void studay(){
        System.out.println("校园供我学习成长...");
    }
}

class Student extends School{
    @Override
    public void studay() {
        System.out.println("我热爱学习...");
    }

    public void hobby(){
        System.out.println("我爱打篮球...");
    }
}
