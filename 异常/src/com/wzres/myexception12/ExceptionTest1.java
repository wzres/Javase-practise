package com.wzres.myexception12;

/**
 * @ClassName ExceptionTest1
 * @date 2023-07-16 22:21
 */
public class ExceptionTest1 {
    public static void main(String[] args) {
        try {
            test();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    private static void test() throws MyException {
        int num = (int) (Math.random() * 100);
        if (num % 2 ==0) {
            System.out.println(num);
            System.out.println("偶数可以正常工作...");
        } else throw new MyException("负数，不可以正常工作");
    }
}

class MyException extends Exception{
    public MyException() {

    }

    public MyException(String message) {
        super(message);
    }
}
