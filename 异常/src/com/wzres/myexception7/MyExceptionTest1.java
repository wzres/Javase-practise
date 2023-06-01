package com.wzres.myexception7;

import java.util.Scanner;

/**
 * @ClassName MyExceptionTest1
 * @description
 * @date 2023-05-31 23:01
 */
public class MyExceptionTest1 {
    public static void main(String[] args) {
        try {
            dev();
        } catch (WZException e) {
            e.printStackTrace();
        }
    }

    private static void dev() throws WZException {
        Scanner num = new Scanner(System.in);
        System.out.print("请输入数字：");
        int i = num.nextInt();

        if(i % 2 ==0){
            System.out.println("偶数，可以正常工作");
        } else throw new WZException("奇数不可以正常工作");
    }
}

class WZException extends Exception{
    public WZException() {
        super();
    }

    public WZException(String message) {
        super(message);
    }
}
