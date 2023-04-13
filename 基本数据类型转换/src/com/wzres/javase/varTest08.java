package com.wzres.javase;

/**
 * @ClassName：varTest08
 * @description：
 * @date：2023-04-14 00:45
 */
public class varTest08 {

    public static void main(String[] args) {
        System.out.println("Integer.max() = " + Integer.MAX_VALUE);
        long i = 2147483648L;
        byte b = (byte) 128;
        System.out.println(b);

        // 小容量 ➟ 大容量
        byte b1 = 20;
        int i1 = b1;

        int i2 = 40;
        float f = i2;

        // 大容量 ➟ 小容量
        int x = 45;
        byte y = (byte) x;
        float f1 = (float) 3.15;

    }


}
