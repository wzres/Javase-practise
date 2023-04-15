package com.wzres.override1;

/**
 * @ClassName：OverrideTest5
 * @description：
 * @date：2023-04-15 09:12
 */
public class OverrideTest5 {
    public static void main(String[] args) {
        Android android = new Android();
        android.function();
    }

}

class Phone{
    public void function(){
        System.out.println("手机可以打电话...");
    }
}

class Android extends Phone{
    //方法覆盖：当父类的方法无法满足子类的业务需求时，必须将父类继承过来的方法进行重写
    @Override
    public void function() {
        System.out.println("安卓手机可以看电影");
    }
}
