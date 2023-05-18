package com.wzres.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @ClassName ExceptionTest7
 * @description
 * @date 2023-05-15 11:40
 */
public class ExceptionTest7 {
    public static void main(String[] args) {
        try {
            hello();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("你好，出异常了");
        }

        System.out.println("异常之后代码");
    }

    public static void hello() throws FileNotFoundException {
        FileInputStream f = new FileInputStream("123");
    }
}
