package com.wzres.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName：ExceptionTest5
 * @description：
 * @date：2023-04-30 16:18
 */
public class ExceptionTest5 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            test();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void test() throws FileNotFoundException, ParseException {
        FileOutputStream f = new FileOutputStream("test");
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.parse("123");
    }

}
