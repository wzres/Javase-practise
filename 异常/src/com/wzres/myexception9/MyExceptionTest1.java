package com.wzres.myexception9;

import java.util.Scanner;

/**
 * @ClassName MyException
 * @date 2023-06-17 17:15
 */
public class MyExceptionTest1 {
    public static void main(String[] args) {
       for(;;){
           try {
               test();
           } catch (WZException e) {
               e.printStackTrace();
           }
       }
    }

    private static void test() throws WZException {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入数字：");
        int num = s.nextInt();

        if(num % 2 ==0){
            System.out.println("偶数可以正常工作");
        } else throw new WZException("奇数不可以正常工作");
    }
}

class WZException extends Exception{
    public WZException() {

    }

    public WZException(String message) {
        super(message);
    }
}


