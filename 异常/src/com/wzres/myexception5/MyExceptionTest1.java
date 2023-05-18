package com.wzres.myexception5;

import java.util.Random;

/**
 * @ClassName MyExceptionTest1
 * @description
 * @date 2023-05-15 11:51
 */
public class MyExceptionTest1 {

    public static void main(String[] args) {
        int num = new Random().nextInt();
        if (num % 2 == 0) {
            System.out.println("偶数，可以正常工作");
        } else try {
            throw new Exception("不可以工作");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

}

class MyException extends Exception{

    public MyException() {

    }

    public MyException(String message) {
        super(message);
    }
}

