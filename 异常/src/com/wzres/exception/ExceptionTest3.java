package com.wzres.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @ClassName：RuntimeExceptionTest3
 * @description：
 * @date：2023-04-13 04:49
 */
public class ExceptionTest3 {
    public static void main(String[] args) {
        try {
            test();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println(123);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println(456);
        }
        System.out.println("abc");
    }

    private static void test() throws FileNotFoundException, ParseException {
        SimpleDateFormat s = new SimpleDateFormat();
        s.parse("56");
        FileInputStream f = new FileInputStream("456");
    }

}
