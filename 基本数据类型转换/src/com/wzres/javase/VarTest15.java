package com.wzres.javase;

/**
 * @ClassName VarTest15
 * @description
 * @date 2023-06-01 22:18
 */
public class VarTest15 {
    public static void main(String[] args) {
        byte b1 = 15;
        byte b2 = 17;
        byte b3 = (byte) (b1 + b2);

        byte b4 = (byte) 128;

        byte b5 = (byte) (b1 + 1);

        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue);

        //long x = 2147483648;
        long x = 2147483648L;

        //向上转型
        int num = 10;
        float f = num + 1;

        byte s = 110;
        int age = s + 1;

        double d = num + 1.5;

        //向下转型
        byte s1 = (byte) 128;

        byte s2 = (byte) (b1 + 10);

        double d1 = 1.5;

        int i2 = (int) d1;

        float f2 = (float) (s + 1.7);

        float f3 = 2.5F;

    }
}
