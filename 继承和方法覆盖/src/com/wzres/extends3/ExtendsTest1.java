package com.wzres.extends3;

/**
 * @ClassName：ExtendsTest1
 * @description：
 * @date：2023-05-02 21:17
 */
public class ExtendsTest1 {
    public static void main(String[] args) {
        Android a = new Android("华为");
        a.install();
    }
}

class Phone{
    private String brand;

    public Phone() {
    }

    public Phone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void install(){
        System.out.println(brand+"安装手机系统");
    }
}

class Android extends Phone{

    public Android(String brand) {
        //使用super()：调用父类的有参构造
        super(brand);
    }

    //方法覆盖
    @Override
    public void install() {
        System.out.println(getBrand()+"安装安卓系统");
    }
}

class Apple extends Phone{
    public Apple(String brand){
        super(brand);
    }

    @Override
    public void install() {
        System.out.println(getBrand()+"安装苹果系统");
    }
}

