package com.wzres.exception3;

/**
 * @ClassName ExceptionTest2
 * @description
 * @date 2023-06-07 11:21
 */
public class ExceptionTest2 {
    public static void main(String[] args) {
        try {
            primary();
        } catch (Exception e) {
            System.out.println("空指针运行时异常...");
            e.printStackTrace();
        }
    }

    private static void primary() {
        String s = null;
        System.out.println(s.trim());
    }
}
