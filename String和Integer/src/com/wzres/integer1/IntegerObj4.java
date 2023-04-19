package com.wzres.integer1;

/**
 * @ClassName：IntegerObj4
 * @description：
 * @date：2023-04-18 21:32
 */
public class IntegerObj4 {
    public static void main(String[] args) {
        //手动装箱
        Integer integer = new Integer(123);
        Integer integer1 = new Integer(123);
        System.out.println(integer==integer1); // false
        System.out.println(integer); //integer重写了toString
        //integer重写了equals
        System.out.println(integer.equals(integer1)); //true

        //手动拆箱
        int i = integer.intValue();

        //自动装箱
        //整数常量池 -127~128
        Integer x = 123;
        Integer z = 123;
        System.out.println(x==z); //true


        //自动拆箱
        int y = x;



    }
}
