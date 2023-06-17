package com.wzres.exception4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @ClassName RuntimeExceptionTest1
 * @date 2023-06-17 17:07
 */
public class RuntimeExceptionTest1 {
    public static void main(String[] args) {
        try {
            test();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        hello();

        System.out.println("你好");
    }

    private static void test() throws FileNotFoundException { //test方法不处理这个异常，将这个编译时异常抛给了调用者main方法调用
        FileInputStream f = new FileInputStream("123");
    }

    private static void hello() { //test方法不处理这个异常，将这个编译时异常抛给了调用者main方法调用
        try {
            FileInputStream f = new FileInputStream("123");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("hellomethod处理了异常");
    }
}
