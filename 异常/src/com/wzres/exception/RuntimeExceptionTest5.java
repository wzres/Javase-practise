package com.wzres.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @ClassName：RuntimeExceptionTest5
 * @description：
 * @date：2023-05-07 22:28
 */
public class RuntimeExceptionTest5 {
    public static void main(String[] args) {
       /* try {
            test();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("打印异常代码");
            e.printStackTrace();
        }
        System.out.println("出现异常了，也照样输出");*/

        test();
    }

    private static void test(){
        try {
            FileInputStream fis = new FileInputStream("469");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
