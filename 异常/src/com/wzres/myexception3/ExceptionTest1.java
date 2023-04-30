package com.wzres.myexception3;

import java.util.Scanner;

/**
 * @ClassName：ExceptionTest1
 * @description：
 * @date：2023-04-30 16:25
 */
public class ExceptionTest1 {

    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字：");
        int num = scanner.nextInt();
        if(num % 2 ==0){
            System.out.println("偶数，可以正常工作");

        } else throw new MyException("奇数，不可以正常工作...");

    }

}

class MyException extends Exception{
    public MyException() {

    }

    public MyException(String message) {
        super(message);
    }
}
