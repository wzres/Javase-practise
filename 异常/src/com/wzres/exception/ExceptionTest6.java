package com.wzres.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @ClassName：ExceptionTest6
 * @description：
 * @date：2023-05-07 22:25
 */
public class ExceptionTest6 {
    public static void main(String[] args) throws FileNotFoundException {
        test();
        System.out.println("123");
    }

    private static void test() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("123");
    }

}
