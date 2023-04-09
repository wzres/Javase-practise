package com.wzres.integer1;

/**
 * @ClassName：IntegerObj
 * @description：
 * @date：2023-04-05 03:07
 */
public class IntegerObj1 {
    public static void main(String[] args) {

        //手动装箱
        Integer intObj1 = new Integer("456");
        //手动拆箱
        int i1 = intObj1.intValue();

        Integer intObj2 = new Integer("456");
        System.out.println(intObj1==intObj2);//false



        //整数常量池，直接取，Integer在池中对象已经提前创建好了
        //自动装箱
        Integer i2 = 23;
        //自动拆箱
        int intVar = i2;
        System.out.println(i2+1);//自动拆箱 24
        System.out.println("i2 = 23吗? "+(i2==23));//自动拆箱 true

        Integer i3 = 23;
        System.out.println(i2==i3);//true

        Integer i4 = 129; //等同于Integer i4 = new Integer("129");
        Integer i5 = 129; //等同于Integer i4 = new Integer("129");
        System.out.println(i4==i5);//false

        System.out.println(i4.equals(i5));//true

    }
}
