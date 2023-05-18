package com.wzres.javase;

/**
 * @ClassName：VarTest13
 * @description：
 * @date：2023-05-09 22:07
 */
public class VarTest13 {
    public static void main(String[] args) {
        //int i = 2147483648;
        //long i = 2147483648;
        long l = 2147483618L;
        System.out.println(Integer.MAX_VALUE);

        byte b = (byte) 128;
        byte y = 123;


        // 数据类型提升

        int i = 123;
        float f = i;

        char a = 97;
        long L = a;

        float ff = b+1;


        //强转

        float d = (float) 10.35;

        byte b1 = (byte) (y+1);

        int a1 = 2135;
        long du = a1;

        

    }
}
