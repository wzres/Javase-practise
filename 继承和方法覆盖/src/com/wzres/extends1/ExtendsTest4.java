package com.wzres.extends1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName：ExtendsTest4
 * @description：
 * @date：2023-04-10 03:55
 */
public class ExtendsTest4 {
    public static void main(String[] args) {
        User user = new User();
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        String nowTime = s.format(d);
        user.setUsername("张三");
        user.setPassword("123456");
        user.setNowTime(nowTime);
        user.getBoth();
    }
}

class User extends Client{
    private String nowTime;
    public void getBoth(){
        System.out.println("登录时间:"+getNowTime()+"，用户名："+getUsername()+"，密码："+getPassword());
    }

    public String getNowTime() {
        return nowTime;
    }

    public void setNowTime(String nowTime) {
        this.nowTime = nowTime;
    }
}

class Client{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}



