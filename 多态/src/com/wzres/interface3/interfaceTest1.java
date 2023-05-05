package com.wzres.interface3;

import java.text.ParseException;

/**
 * @ClassName：interfaceTest1
 * @description：
 * @date：2023-05-03 11:48
 */
public class interfaceTest1 {
    public static void main(String[] args) {
        //多态 面向接口编程
        Android a = new Phone();
        a.install();

        //向下转型
        //访问子类特有方法，需要向下转型
        if(a instanceof Phone){
            Phone p = (Phone) a;
            p.recover();
        }
    }
}

interface Android{
    void install();
}

class Phone implements Android{

    @Override
    public void install() {
        System.out.println("安装安卓系统");
    }

    public void recover(){
        System.out.println("恢复出厂设置");
    }
}