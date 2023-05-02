package com.wzres.Innerclass2;

/**
 * @ClassName：InnerClassTest1
 * @description：
 * @date：2023-05-01 10:36
 */
public class InnerClassTest1 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.a = new Apple() {
            @Override
            public String install(String s) {
                return s;
            }
        };

        phone.MyInstall("黑莓");
    }
}

interface Apple{
    String install(String s);
}

class Phone{
    Apple a;
    public void MyInstall(String brand){
        String install = a.install(brand);
        System.out.println(install+"：正在重装苹果系统...");
    }
}
