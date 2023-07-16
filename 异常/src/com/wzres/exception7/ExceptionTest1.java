package com.wzres.exception7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @ClassName ExceptionTest1
 * @date 2023-07-16 22:15
 */
public class ExceptionTest1 {
    public static void main(String[] args) {
        try {
            test();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("抛给main方法调用者，main方法捕捉了该异常");
        }

        dev();
    }

    private static void dev() {
        try {
            FileInputStream fis = new FileInputStream("456");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("dev自己捕捉异常");

        }
    }

    private static void test() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("123");
    }


}
