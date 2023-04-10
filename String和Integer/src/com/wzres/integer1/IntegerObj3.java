package com.wzres.integer1;

/**
 * @ClassName：IntegerObj3
 * @description：equals和整型常量池
 * @date：2023-04-11 04:36
 */
public class IntegerObj3 {
    public static void main(String[] args) {
        Integer x = 456; //堆中创建Integer对象 等同于 Integer x = new Integer(456);
        Integer y = 456; //堆中创建Integer对象 等同于 Integer x = new Integer(456);
        System.out.println(x==y); //false，new了2次，引用所保存的内存地址不同

        //比较对象内容是否相等，不能用==号，应该用equals方法，Integer重写了equals方法
        System.out.println(x.equals(y)); //true

        //重点*****：整型常量池：-128~127，不再创建Integer对象了，直接从整型常量池中取
        Integer a = 45; //方法区整型常量池创建Integer对象
        Integer b = 45; //方法区整型常量池创建Integer对象
        System.out.println(a==b); //true，引用所保存的内存地址直接指向同一个整型常量池Integer对象



    }
}
