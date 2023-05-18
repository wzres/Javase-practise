package com.wzres.method;

/**
 * @ClassName：MethodTest3
 * @description：
 * @date：2023-05-12 22:20
 */
public class MethodTest3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.println(d.test("哈巴狗"));
    }
}

class Dog{
    public <T> T test(T t){
        return t;
    }
}
