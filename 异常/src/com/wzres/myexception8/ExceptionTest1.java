package com.wzres.myexception8;

import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName ExceptionTest1
 * @description
 * @date 2023-06-07 11:23
 */
public class ExceptionTest1 {
    public static void main(String[] args) {
        try {
            primary();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    private static void primary() throws MyException {
        Random r = new Random();
        int num = r.nextInt();
        if(num % 2 ==0){
            System.out.println("偶数，可以正常工作");
        } else throw new MyException("奇数，不可以正常工作");
    }
}

class MyException extends Exception{
    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
