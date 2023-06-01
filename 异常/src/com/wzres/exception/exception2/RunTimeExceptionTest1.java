package com.wzres.exception.exception2;

/**
 * @ClassName RunTimeExceptionTest1
 * @description
 * @date 2023-05-31 22:59
 */
public class RunTimeExceptionTest1 {
    public static void main(String[] args) {

        try {
            flag();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void flag() {
        String s = null;
        System.out.println(s.trim());
    }


}
