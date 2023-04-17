package com.wzres.interface1;

/**
 * @ClassName：InterfaceTest2
 * @description：
 * @date：2023-04-16 06:42
 */
public class InterfaceTest2 {
    public static void main(String[] args) {
        //向上转型
        Android a = new phone();
        a.function();
        //向下转型
        //访问子类特有的方法
        if(a instanceof  phone){
            phone phone = (phone) a;
            phone.recover();
        }
    }
}

interface Android{
    void function();
}

class phone implements Android {
    //实现接口，必须将接口中的方法重写
    @Override
    public void function() {
        System.out.println("重装安卓系统...");
    }

    public void recover(){
        System.out.println("恢复出厂设置...");
    }
}
