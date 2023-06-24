package com.wzres.exception5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @ClassName ExceptionTest1
 * @date 2023-06-23 16:01
 */
public class ExceptionTest1 {
    public static void main(String[] args) {
        try {
            test();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        hello();
    }

    private static void hello() { //自己处理
        try {
            FileInputStream fis = new FileInputStream("123");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void test() throws FileNotFoundException { //交由调用者处理该异常
        //IO流
        FileInputStream fis = new FileInputStream("abc");
    }


}
