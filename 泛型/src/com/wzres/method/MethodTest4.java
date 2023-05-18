package com.wzres.method;

/**
 * @ClassName MethodTest4
 * @description
 * @date 2023-05-16 21:39
 */
public class MethodTest4 {
    public static void main(String[] args) {
        Cat c = new Cat();
        String s = c.eat("456");
        System.out.println(s);
        A eat = c.eat(new A());
        System.out.println(eat);
    }
}

class Cat{
    public <T> T eat(T t){
        return t;
    }
}

class A{

}