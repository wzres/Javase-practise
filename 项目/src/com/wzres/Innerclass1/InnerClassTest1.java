package com.wzres.Innerclass1;

/**
 * @ClassName：InnerClassTest1
 * @description：匿名内部类
 * @date：2023-05-01 10:08
 */
public class InnerClassTest1 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.MyInstall(new Android() {
            @Override
            public String install(String b) {
                return b;
            }
        },"华为");
    }
}

interface Android{
    public String install(String b);
}

/*class AndroidImpl implements Android{

    @Override
    public String install(String b) {
        return b;
    }
}*/

class Phone{
    public void MyInstall(Android a,String brand){
        String install = a.install(brand);
        System.out.println(install+"：正在安装安卓系统");
    }
}

