package com.wzres.exception7;

/**
 * @ClassName RunTimeExceptionTest1
 * @date 2023-07-16 22:18
 */
public class RunTimeExceptionTest1 {
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            e.printStackTrace();
        }

        dev();
    }

    private static void dev(){
        try {
            System.out.println(1/0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void test() {
        String s = null;
        System.out.println(s.trim());
    }
}
