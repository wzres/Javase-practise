package com.wzres.method5;


/**
 * @ClassName MethodTest1
 * @date 2023-06-28 01:22
 */
public class MethodTest1 {
    public static void main(String[] args) {
        GreenTea greenTea = new GreenTea();
        System.out.println(greenTea.drink("123"));
    }
}

class GreenTea{
    public <T> T drink(T t) {
        return t;
    }
}
