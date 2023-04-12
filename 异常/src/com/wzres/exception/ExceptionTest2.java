package com.wzres.exception;

/**
 * @ClassName：ExceptionTest2
 * @description：
 * @date：2023-04-13 04:43
 */
public class ExceptionTest2 {
    public static void main(String[] args) {
        try {
            hello();
            test();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println(123);
    }

    private static void hello() {
        System.out.println(1/0);
    }

    private static void test() {
        String s = null;
        System.out.println(s.length());
    }

}
