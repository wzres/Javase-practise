package com.wzres.integer2;

/**
 * @ClassName：IntegerObj2
 * @description：
 * @date：2023-05-06 10:04
 */
public class IntegerObj2 {
    public static void main(String[] args) {
        //手动装箱
        Integer i = new Integer(123);

        //手动拆箱
        int i1 = i.intValue();

        // Integer重写了toString
        System.out.println(i); //123
        System.out.println(i+1); //自动拆箱

        //自动装箱
        Integer num = 123;

        //自动拆箱
        int x = num;

        // 整型常量池 -128~127，不再newInteger对象，直接取
        Integer age1 = 52;
        Integer age2 = 52;
        System.out.println(age1==age2); //true


        Integer age3 = 128; //等同于Integer age = new Integer(128);
        Integer age4 = 128; //等同于Integer age = new Integer(128);
        System.out.println(age3 == age4); //false

        //不比较内存地址，比较对象内容是否相等，Integer重写了equals
        System.out.println("age3.equals(age4) = " + age3.equals(age4));


    }
}
