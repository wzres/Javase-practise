package com.wzres.extends4;

/**
 * @ClassName ExtendsTest1
 * @description
 * @date 2023-05-15 20:55
 */
public class ExtendsTest1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.hello();
    }
}

class Student extends Person{
    // 方法覆盖：但父类的方法无法满足子类的需求时，需要重写该方法
    @Override
    public void hello() {
        System.out.println("我是学生...");
    }
}

class Person{
    public void hello(){
        System.out.println("我是人类...");
    }
}