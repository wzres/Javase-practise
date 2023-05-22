package com.wzres.myexception6;

import java.util.Random;

/**
 * @ClassName MyExceptionTest1
 * @description
 * @date 2023-05-19 21:06
 */
public class MyExceptionTest1 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt();

        if(num % 2 ==0){
            System.out.println(num);
            System.out.println("偶数可以正常输出");
        } else try {
            throw new MyException("奇数不可以正常输出...");
        } catch (MyException e) {
            e.printStackTrace();
        }
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
