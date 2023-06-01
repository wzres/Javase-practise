package com.wzres.integer3;

/**
 * @ClassName IntegerObj1
 * @description
 * @date 2023-05-24 20:31
 */
public class IntegerObj1 {
    public static void main(String[] args) {

        //手动装箱
        Integer i = new Integer(123);
        //手动拆箱
        int i1 = i.intValue();

        Integer c = 456; //等同于：Integer c = new Integer(456);

        Integer d = 456;

        System.out.println(c ==d);//false


        //-128~127 整型常量池直接取，不需要new对象
        //自动装箱
        Integer x = 123;

        //自动拆箱
        int a  = x;

        Integer y = 123;

        System.out.println(x==y); //true
    }
}
