package com.wzres.method;

/**
 * @ClassName：MethodTest
 * @description：
 * @date：2023-04-26 22:02
 */
public class MethodTest {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.test("123"));

    }
}

class Student{
    public <T> T test(T t){
        return t;
    }
}
