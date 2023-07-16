package com.wzres.myexception11;

/**
 * @ClassName MyException01
 * @date 2023-07-06 23:17
 */
public class MyException01 {
    public static void main(String[] args) {
        try {
            test();
        } catch (WZException e) {
            e.printStackTrace();
        }
    }

    private static void test() throws WZException {
        int num = (int) (Math.random() * 100);
        if(num % 2 ==0){
            System.out.println(num);
            System.out.println("偶数可以正常工作");
        } else {
            System.out.println(num);
            throw new WZException("奇数不可以正常工作");}
    }
}
