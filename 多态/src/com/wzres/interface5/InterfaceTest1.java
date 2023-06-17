package com.wzres.interface5;

/**
 * @ClassName InterfaceTest1
 * @date 2023-06-12 17:33
 */
public class InterfaceTest1 {
    public static void main(String[] args) {
        PhoneSystem p = new Android();
        p.install("华为");

        //访问子类接口必须向下转型
        if(p instanceof Android){
            ((Android) p).recover();
        }

        PhoneSystem p2 = new Apple();
        p2.install("黑莓");


        //类型转换异常，
        // 编译期PhoneSystem和Android有继承关系，可以强转，但运行时，是apple对象，apple和Android没有继承关系，无法强转
        Android a = (Android) p2;
        a.recover();




    }
}

interface PhoneSystem{
    void install(String brand);
}

class Android implements PhoneSystem{

    @Override
    public void install(String brand) {
        System.out.println(brand+"正在重装安卓系统");
    }

    public void recover(){
        System.out.println("正在恢复出厂设置...");
    }
}

class Apple implements PhoneSystem{

    @Override
    public void install(String brand) {
        System.out.println(brand+"正在重装苹果系统");
    }
    public void recover(){
        System.out.println("正在恢复出厂设置...");
    }

}