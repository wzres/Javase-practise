package com.wzres.method4;



/**
 * @ClassName methodTest1
 * @date 2023-06-19 18:00
 */
public class methodTest1 {
    public static void main(String[] args) {
        School s = new School();
        System.out.println(s.dev("123"));

    }
}

class School{

    public <T> T dev(T t){
        return t;
    }
}

