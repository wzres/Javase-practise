package com.wzres.multi5;

/**
 * @ClassName：MultTest1
 * @description：
 * @date：2023-04-25 21:38
 */
public class MultTest1 {
    public static void main(String[] args) {
        // 向上转型
        Phone p = new Android();
        p.install();
        //向下转型：访问子类特有方法时，需要向下转型
        if (p instanceof Android){
            Android android = (Android) p;
            android.recover();
        }else if(p instanceof Apple){
            Apple apple = (Apple) p;
            apple.recover();
        }


    }
}

class Phone{
    public void install(){
        System.out.println("安装手机系统...");
    }
}

class Android extends Phone{
    @Override
    public void install() {
        System.out.println("安装安卓系统...");
    }

    public void recover(){
        System.out.println("恢复出厂设置...");
    }
}

class Apple extends Phone{
    @Override
    public void install() {
        System.out.println("安装苹果系统...");
    }

    public void recover(){
        System.out.println("恢复出厂设置...");
    }
}