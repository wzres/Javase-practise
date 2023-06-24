package com.wzres.integer4;

/**
 * @ClassName IntegerTest1
 * @date 2023-06-23 17:14
 */
public class IntegerTest1 {
    public static void main(String[] args) {
        //手动装箱
        Integer i = new Integer(5);

        //手动拆箱
        int num = i.intValue();
        System.out.println(num);

        //自动装箱
        Integer s = 15;
        //自动拆箱
        int age = s;

        System.out.println(s+1);

        Integer a = 244; //等于 integer a = new Integer(244);
        Integer b = 127; //字符串常量池 (-128-127之间)

        Integer a1 = 245;
        Integer b1 = 245;

        System.out.println(a1==b1); //false
        System.out.println("是否相等"+a1.equals(b1));

        Integer k = 127;
        Integer l = 127;
        System.out.println(k==l); //true

    }
}
