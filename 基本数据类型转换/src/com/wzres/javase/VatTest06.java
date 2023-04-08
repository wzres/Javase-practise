package com.wzres.javase;

/**
 * @ClassName：VatTest06
 * @description：
 * @date：2023-04-08 07:34
 */
public class VatTest06 {
    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE;
        System.out.println("maxValue = " + maxValue);
        long l  = 2147483648L;
        byte b = (byte) 128;

        //小容量➟大容量
        int i1 = 10;
        long l2 = i1;

        byte b2 = 34;
        int i3 = b2;

        float f = (float) 3.15;

        //大容量➟小容量

        int  i4 = 21;

        byte b3 = (byte) i4;

        float f1 =15F;
        int  f24= (int) f1;



    }
}
