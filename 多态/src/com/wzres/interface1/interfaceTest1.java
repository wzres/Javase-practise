package com.wzres.interface1;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @ClassName：interfaceTest1
 * @description：
 * @date：2023-04-10 18:33
 */
public class interfaceTest1 {

    public static void main(String[] args) {
        String [] arr = {"打球","游泳"};
        Date d = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String birth = simpleDateFormat.format(d);
        Person p = new Master();
        p.hobby(arr);
        //访问子类中特有的方法，必须向下转型
        Master master = (Master) p;
        master.birth(birth);
    }


}

interface Person{
    void hobby(String [] hobbys);
}

class Master implements Person{

    private static String username="老大爷";

    //重点：实现接口，必须将接口的方法全部实现
    @Override
    public void hobby(String [] hobbys) {
        System.out.println(username+"的兴趣爱好："+ Arrays.toString(hobbys));
    }

    public void birth(String date){
        System.out.println(username+"的生日："+date);
    }
}
