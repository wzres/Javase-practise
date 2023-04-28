package com.wzres.integer2;

/**
 * @ClassName：IntegerObj1
 * @description：
 * @date：2023-04-28 21:38
 */
public class IntegerObj1 {
    public static void main(String[] args) {
        Integer I1 = new Integer(123);
        Integer I2 = new Integer(123);
        System.out.println(I1==I2);


        Integer x1 = 456; //相当于 Integer x1 = new Integer(456);
        Integer x2 = 456;
        System.out.println(x1==x2); //false

        System.out.println(x1.equals(x2)); //true

        //-128~127直接从字符串常量池取，不需要创建对象
        Integer x = 123;
        Integer y = 123;
        System.out.println(x==y); //true


    }
}
