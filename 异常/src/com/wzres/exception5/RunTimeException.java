package com.wzres.exception5;

/**
 * 运行时异常
 *
 * @ClassName RunTimeException
 * @date 2023-06-23 16:04
 */
public class RunTimeException{
    public static void main(String[] args) {
        test();

        try {
            hello();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("main处理了该异常");
        }

    }

    private static void hello() throws Exception{ //交有调用者处理异常
        String s = null;
        System.out.println(s.trim());
    }

    private static void test() { //自己处理运行时异常
        try {
            String s = null;
            System.out.println(s.trim());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("test处理了该异常");
        }
    }
}
