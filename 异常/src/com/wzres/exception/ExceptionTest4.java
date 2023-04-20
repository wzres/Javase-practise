package com.wzres.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @ClassName：ExceptionTest4
 * @description：
 * @date：2023-04-20 21:06
 */
public class ExceptionTest4 {
    public static void main(String[] args)  {
        test();
    }

    public static void test()  {
        //FileOutputStream f = new FileOutputStream("123");
        try {
            FileOutputStream f = new FileOutputStream("123");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
