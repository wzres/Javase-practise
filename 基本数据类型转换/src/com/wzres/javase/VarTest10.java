package com.wzres.javase;

/**
 * @ClassName：VarTest10
 * @description：
 * @date：2023-04-21 21:52
 */
public class VarTest10 {
    public static void main(String[] args) {
        int minValue = Integer.MAX_VALUE;
        System.out.println("minValue = " + minValue);
        //int i = 2147483648;
        //long i  = 2147483648;
        long i  = 2147483648L;

        byte b = (byte) 128;

        // 小容量 ➟ 大容量

        byte b2 = 30;
        int x = b2;

        int x1 = 30;
        float f = x1;

        int d = 3545;
        long l = d;

        // 大容量 ➟ 小容量
        float f1  = (float) 3.14;

        long l2 = 254;
        int d1 = (int) l2;

    }
}
