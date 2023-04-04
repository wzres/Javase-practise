package com.wzres.javase;

/**
 * @ClassName：VarTest02
 * @description：
 * @date：2023-04-02 00:01
 */
public class VarTest02 {
    public static void main(String[] args) {
        byte b = 127;

        byte b1 = (byte) 128;//-128
        System.out.println("b1 = " + b1);

        long l = 2147483648L;
        int  i = (int) l;

        //小容量 ➟ 大容量(自动类型提升)
        byte b2 = 126;
        int i2 = b2+1;

        int i3 = 4568;
        long l1 = i3;

        long l2 = 56985L;
        float f = l2;

        float f1 = 3.15F;
        double d = f1;

        //大容量 ➟ 小容量(强制类型转换)
        byte b3 = 10;
        byte b4 = (byte) (b3+1);


        short s = 15;
        byte b5 = (byte) s;

        char c = 'a';
        byte b6 = (byte) (c+1);

        double d1 = 2.15;
        int i4 = (int) (d1+1);
        System.out.println("i4 = " + i4);

        long l3 = 205;
        int i1 = (int) l3;
    }
}
