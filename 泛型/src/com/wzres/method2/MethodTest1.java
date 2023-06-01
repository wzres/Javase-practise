package com.wzres.method2;

/**
 * @ClassName MethodTest1
 * @description
 * @date 2023-05-28 21:56
 */
public class MethodTest1 {
    public static void main(String[] args) {
        Transancation t = new Transancation();
        System.out.println(t.test("123"));
    }
}

class Transancation{
    public <T> T test(T t){
        return t;
    }
}
