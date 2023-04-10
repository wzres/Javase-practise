package com.wzres.array1;

/**
 * @ClassName：ArrayTest2
 * @description：
 * @date：2023-04-10 18:59
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        //静态初始化数组
        int arr [] = {35,46,87};
        for (int arrs : arr) {
            System.out.println(arrs);
        }

        byte bytes [] = {97,98,99};
        for (byte b : bytes) {
            System.out.println(b);
        }

        //动态初始化数组
        String str [] = new String[4];
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
