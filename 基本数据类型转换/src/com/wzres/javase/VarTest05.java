package com.wzres.javase;

/**
 * @ClassName：VarTest05
 * @description：
 * @date：2023-04-07 08:03
 */
public class VarTest05 {
    public static void main(String[] args) {
        //二进制以0b开头
        int i = 0b010101;
        //八进制以0开头
        int a = 0236;

        //十进制 0-9
        int  b = 19;

        //十六进制  以0x开头
        int x = 0xe9;

        System.out.println("i = " + i); //21
        System.out.println("a = " + a); //158
        System.out.println("b = " + b); //19
        System.out.println("x = " + x); //233


    }
}
