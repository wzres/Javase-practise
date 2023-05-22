package com.wzres.exception;

/**
 * @ClassName RuntimeExceptionTest7
 * @description
 * @date 2023-05-19 21:05
 */
public class RuntimeExceptionTest7 {
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("空指针异常");
            e.printStackTrace();
        }
    }

    private static void test() {
        String s = null;
        System.out.println(s.trim());
    }
}
