package com.wzres.exception;

/**
 * @ClassName RuntimeExceptionTest6
 * @description
 * @date 2023-05-15 11:42
 */
public class RuntimeExceptionTest6 {
    public static void main(String[] args) {
        try {
            flag();
        } catch (Exception e) {
            String message = e.getMessage();
            System.out.println(message);
            System.out.println("捕捉空指针异常");
            e.printStackTrace();
        }

        System.out.println("异常之后代码");
    }

    public static void flag(){
        String s = null;
        System.out.println(s.trim());
    }
}
