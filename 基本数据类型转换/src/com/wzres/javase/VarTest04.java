package com.wzres.javase;

/**
 * @ClassName：VarTest04
 * @description：
 * @date：2023-04-04 09:00
 */
public class VarTest04 {
    public static void main(String[] args) {

        byte b = 35;
        byte c = (byte) 128;

        //int i = 2147483648;

        Long i = 2147483648L;

        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);

        //小容量 ➟ 大容量

        byte a = 10;
        int b1 = a;

        int in = 34;
        long l = in;

        int b2 = 30;
        float c1 = b2;

        //大容量 ➟ 小容量
        byte by = 3;

        byte bb = (byte) (by +3); //byte参与运算的时候会转换成Int型

        int in1 = 35;
        byte by2 = (byte) in1;

        float f = (float) 3.15;

        char ch = 98;
        int in2 = ch+1;
    }
}
