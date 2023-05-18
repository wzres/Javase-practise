package com.wzres.multi7;

/**
 * @ClassName MultTest1
 * @description
 * @date 2023-05-16 20:54
 */
public class MultTest1 {
    public static void main(String[] args) {
        //向上转型
        Phone p = new Android();
        p.install();


        //访问子类特有方法需要向下转型
        if(p instanceof Android){
            Android a = (Android) p;
            a.recovery();
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

    public void recovery(){
        System.out.println("安卓恢复出厂设置...");
    }
}


