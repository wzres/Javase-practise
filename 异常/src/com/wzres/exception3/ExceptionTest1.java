package com.wzres.exception3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @ClassName ExceptionTest1
 * @description
 * @date 2023-06-07 11:18
 */
public class ExceptionTest1 {
    public static void main(String[] args) {
        try {
            primary();
        } catch (FileNotFoundException e) {
            System.out.println("异常发生了...");
            e.printStackTrace();
        }
    }

    private static void primary() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("123");
    }
}


