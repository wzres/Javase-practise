package com.wzres.override1;

/**
 * @ClassName：Student
 * @description：
 * @date：2023-03-30 00:49
 */
public class OverrideTest2 {

    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.studay();
    }

}

class Student{
    public void studay(){
        System.out.println("学生正在上课...");
    }
}

class Tom extends Student{
    // 父类的方法无法满足子类的需求，需要重写父类的方法
    @Override
    public void studay() {
        System.out.println("tom正在自习...");
    }
}
