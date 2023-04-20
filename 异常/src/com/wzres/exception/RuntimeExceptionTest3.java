package com.wzres.exception;

/**
 * @ClassName：RuntimeExceptionTest3
 * @description：
 * @date：2023-04-20 21:13
 */
public class RuntimeExceptionTest3 {
    public static void main(String[] args) {
        try {
            extracted();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void extracted() {
        String n = null;
        System.out.println(n.length());
    }


}
