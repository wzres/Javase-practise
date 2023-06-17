package com.wzres.exception4;
/**
*
* @ClassName Exception
* @date 2023-06-17 17:11
*/
public class ExceptionTest1 {
    public static void main(String[] args) {
        hello();
        try {
            dev();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("main方法处理了这个异常");
    }

    public static void dev() throws Exception{
        String s = null;
        System.out.println(s.trim());
    }

    private static void hello() {
        try {
            String s = null;
            System.out.println(s.trim());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("hello处理了这个异常");
    }
}
