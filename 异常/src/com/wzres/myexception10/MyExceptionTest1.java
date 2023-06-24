package com.wzres.myexception10;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;

/**
 * @ClassName MyExceptionTest1
 * @date 2023-06-23 16:09
 */
public class MyExceptionTest1 {
    public static void main(String[] args) {
        try {
            test();
        } catch (wzException e) {
            e.printStackTrace();
        }
    }

    private static void test() throws wzException {
        int num = (int) (Math.random() * 10);

        if(num % 2 ==0){
            System.out.println("偶数可以正常工作");
        } else throw new wzException("奇数不可以工作");
    }
}

class wzException extends Exception{
    public wzException() {
    }

    public wzException(String message) {
        super(message);
    }
}
