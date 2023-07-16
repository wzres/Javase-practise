package com.wzres.static4;

import sun.security.util.Password;

/**
 * @ClassName StaticTest1
 * @date 2023-07-07 21:45
 */
public class StaticTest1 {
    public static void main(String[] args) {
        User.test();
        User user = new User();
        user.m1("zhangsan","456");
        System.out.println(user.getName());
    }
}


class User{
    static String nationality = "中国";
    private String username;
    private String password;

    public static void test(){
        System.out.println(nationality);
    }

    public void m1(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String  getName(){
        System.out.println(getPwd());
        return username;
    }

    public String getPwd(){
        return password;
    }


}
