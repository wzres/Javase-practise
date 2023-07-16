package com.wzres.exception6;

/**
 * @ClassName ExceptionTest01
 * @date 2023-07-06 23:11
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
       test();
        System.out.println(1);

        try {
            hello();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(2);
        }
    }

    private static void hello() throws Exception{
        System.out.println(1/0);

    }

    private static void test() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
