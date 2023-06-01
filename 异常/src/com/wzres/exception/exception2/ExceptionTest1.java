package com.wzres.exception.exception2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @ClassName ExceptionTest1
 * @description
 * @date 2023-05-31 22:57
 */
public class ExceptionTest1 {
    public static void main(String[] args) {
        try {
            dev();
        } catch (FileNotFoundException e) {
            System.out.println("异常发生...");
            e.printStackTrace();
        }
    }

    private static void dev() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("123");
    }
}
