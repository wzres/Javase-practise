package com.wzres.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @ClassName ExceptionTest8
 * @description
 * @date 2023-05-19 21:03
 */
public class ExceptionTest8 {
    public static void main(String[] args) {
        try {
            test();
        } catch (FileNotFoundException e) {
            System.out.println("异常输出");
            e.printStackTrace();
            System.out.println("打印之后");

        }
        System.out.println("最后");
    }

    private static void test() throws FileNotFoundException {
        FileInputStream f = new FileInputStream("123");
    }


}
