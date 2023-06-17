package com.wzres.method2;


/**
 * @ClassName MethodTest2
 * @description
 * @date 2023-06-03 23:18
 */
public class MethodTest2 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.test("123"));
    }
}

class A{
    public <T> T test(T t){
        return t;
    }
}
