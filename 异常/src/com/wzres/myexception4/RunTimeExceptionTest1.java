package com.wzres.myexception4;

import java.util.Scanner;

/**
 * @ClassName：RunTimeExceptionTest1
 * @description：
 * @date：2023-05-07 22:31
 */
public class RunTimeExceptionTest1 {
    public static void main(String[] args) {
       /* try {
            test();
        } catch (MyRunTime e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }*/

        try {
            test();
        } catch (Exception e) {
            System.out.println("出异常了");
            e.printStackTrace();
        }
    }

    private static void test(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数字：");
        int num = scanner.nextInt();
        if(num % 2 ==0 ){
            System.out.println("偶数可以7正常工作");
        }
        //else throw  new MyRunTime("奇数不可以正常工作");
        //else throw new Exception();
        else throw new RuntimeException();
    }
}

class MyRunTime extends Exception{

    public MyRunTime() {
    }

    public MyRunTime(String message) {
        super(message);
    }
}
