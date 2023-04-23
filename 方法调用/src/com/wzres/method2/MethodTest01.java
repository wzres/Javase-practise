package com.wzres.method2;

/**
 * @ClassName：MethodTest01
 * @description：
 * @date：2023-04-23 20:50
 */
public class MethodTest01 {
    public static void main(String[] args) {
        m1();
        MethodTest01 methodTest01 = new MethodTest01();
        methodTest01.hello();
    }

    public void hello(){
        System.out.println("hello方法执行...");
        test();
    }

    public void test(){
        System.out.println("test方法执行...");
    }

    public static void m1(){
        System.out.println("m1方法执行...");
    }
}


