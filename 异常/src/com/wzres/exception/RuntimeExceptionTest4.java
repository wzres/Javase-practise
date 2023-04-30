package com.wzres.exception;

/**
 * @ClassName：RuntimeExceptionTest4
 * @description：
 * @date：2023-04-30 16:21
 */
public class RuntimeExceptionTest4 {
    public static void main(String[] args) {
        try {
            hello();
            System.out.println("try代码");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("catch代码");
        }

        System.out.println(123);
    }

    public static void hello(){
        String s = null;
        System.out.println(s.trim());
    }
}
