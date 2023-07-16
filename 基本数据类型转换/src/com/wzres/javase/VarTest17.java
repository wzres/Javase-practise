package com.wzres.javase;

/**
 * @ClassName VarTest17
 * @date 2023-07-02 18:41
 */
public class VarTest17 {
    public static void main(String[] args) {
        //数据类型提升

        int g = 10;
        double d = g + 5;

        float f = 10;

        double s = f;

        //大容量转换小容量
        byte b = (byte) 128;

        int age = 4;

        byte b1 = (byte) age;

        //int num = 2147483648;
        long bag = 2147483648L;

        byte b2 = 5;
        b2 += 10; // b2 = (btye)b2+5

        test();

    }

    private static void test() {

        // 二进制
        int a = 0b110; //6
        // 十进制
        int b = 110; //110
        // 八进制
        int c = 056; //46
        // 十六进制
        int d = 0x153;//339

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);


    }


}
