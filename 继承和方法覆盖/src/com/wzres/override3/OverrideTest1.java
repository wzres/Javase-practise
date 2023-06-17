package com.wzres.override3;

/**
 * @ClassName OverrideTest1
 * @description
 * @date 2023-06-07 11:57
 */
public class OverrideTest1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.primary();
    }
}

class Person{
    public void primary(){
        System.out.println("我是一个人");
    }
}

class Student extends Person{
    @Override
    public void primary() {
        // 父类方法无法满足子类需求时，需要将父类继承过来的方法重写覆盖
        System.out.println("我是一名学生");
    }
}
