package com.wzres.method1;

import javax.crypto.interfaces.PBEKey;

/**
 * @ClassName：MethodTest05
 * @description：
 * @date：2023-04-15 07:33
 */
public class MethodTest05{
    public static void main(String[] args) {
        test("中国");
        MethodTest05 methodTest05 = new MethodTest05();
        int s = methodTest05.hello(1,6);
        System.out.println(s);
        String strVar = A.doSome();
        System.out.println(strVar);
    }

    private int hello(int i1, int i2) {
        invoke("调用");
        return i1 + i2;

    }

    private void invoke(String s) {
        System.out.println(s);
    }

    private static void test(String str) {
        System.out.println(str);
        A a = new A();
        Boolean b = a.staMethod("张三");
        Boolean d = a.staMethod("李四");
        System.out.println("b = " + b);
        System.out.println("d = " + d);
    }



}

class A{

    public static String doSome() {
        return "张三你好";
    }

    public Boolean staMethod(String str) {
        if("张三".equals(str)){
            return true;
        }
        return false;
    }
}

