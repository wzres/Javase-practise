package com.wzres.exception6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @ClassName RunTimeExceptionTest01
 * @date 2023-07-06 23:09
 */
public class RunTimeExceptionTest01 {
    public static void main(String[] args) {
        try {
            test();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        hello();
    }

    private static void hello() {
        try {
            FileInputStream fis = new FileInputStream("456");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void test() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("123");
    }
}
