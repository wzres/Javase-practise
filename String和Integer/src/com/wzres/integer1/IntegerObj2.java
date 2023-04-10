package com.wzres.integer1;

/**
 * @ClassName：IntegerObj2
 * @description：toString和构造方法
 * @date：2023-04-11 04:23
 */
public class IntegerObj2 {
    public static void main(String[] args) {
        //构造方法
        /*
        1. new Integer(int)
        2. new Integer(String)
        */

        //手动装箱 基本数据类型 ➟ 引用数据类型
        Integer i1 = new Integer(123);
        System.out.println("i1 = " + i1);
        //手动装箱 字符串 ➟ 引用数据类型
        Integer i2 = new Integer("456");

        //手动拆箱 引用数据类型 ➟ 基本数据类型
        int i3 = i1.intValue();
        //手动拆箱 引用数据类型 ➟ 基本数据类型
        int i4 = i2.intValue();

        //自动装箱 基本数据类型 (自动转换)➟ 引用数据类型
        Integer x = 900; // 等同于 Integer x = new Integer(900)
        //自动拆箱 引用数据类型 (自动转换)➟ 基本数据类型
        int y = x;

        Integer m = 1000;
        System.out.println(m+1); //10001，这里会进行自动拆箱子，将包装类m转换成基本数据类型1000
    }
}
