package com.wzres.method6;

/**
 * @ClassName MethodTest1
 * @date 2023-07-01 21:27
 */
public class MethodTest1 {
    public static void main(String[] args) {
        Clothes clothes = new Clothes();
        clothes.test("456");

        Juice j = new Juice();
        j.dev(456);
    }
}

class Clothes{
    public <T> void test(T t){
        System.out.println(t);
    }
}


class Juice{
    public <T> void dev(T t){
        System.out.println(t);
    }
}