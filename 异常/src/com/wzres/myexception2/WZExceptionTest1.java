package com.wzres.myexception2;

/**
 * @ClassName：com.wzres.myexception.WZException2
 * @description：
 * @date：2023-04-20 21:20
 */
public class WZExceptionTest1 {
    public static void main(String[] args) {
        try {
            test();
        } catch (WZException2 e) {
            e.printStackTrace();
        }
    }

    public static void test() throws WZException2 {
        long l = System.currentTimeMillis();
        if(l % 2 ==0){
            System.out.println("偶数，可以正常工作");
        }else { throw  new WZException2("奇数，不可以正常工作..");

        }
    }
}

class WZException2 extends Exception{
    public WZException2() {

    }

    public WZException2(String message) {
        super(message);
    }
}