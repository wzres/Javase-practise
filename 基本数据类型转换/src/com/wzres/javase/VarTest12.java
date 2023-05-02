package com.wzres.javase;

/**
 * @ClassName：VarTest12
 * @description：
 * @date：2023-04-30 16:42
 */
public class VarTest12 {
    public static void main(String[] args) {
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        //Long i = 2147483648;
        Long i = 2147483648L;

        byte b = (byte) 128;

        // 小容量 ➟ 大容量

        byte x = 64;
        int a = x;

        float f = 57;
        double d = f;

        byte b1 = 51;
        int b2 = (b1 + 1);

        // 大容量 ➟ 小容量

        byte b3 = 45;
        byte b4 = (byte) (b3+1);

        byte b5 = 10;

        int num = 2;

        byte b6 = (byte) (b5/num);

        int age = 17;

        float fb = (float) (age + 12.5);

        double d2 = age + 12.5;
    }
}
