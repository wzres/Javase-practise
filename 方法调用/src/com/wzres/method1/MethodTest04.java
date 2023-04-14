package com.wzres.method1;

/**
 * @ClassName：UserTest
 * @description：
 * @date：2023-04-08 18:34
 */
public class MethodTest04 {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("张三");
        user.setPassword(123456);
        //调用实例方法，必须创建对象引用.才能调用
        user.test();
        //调用静态方法，类名.
        System.out.println(User.staticMethod(user.getUsername()));
    }
}

class User{
    private String username;
    private Integer password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public void test(){
        System.out.println("欢迎"+username+"登录本系统");
    }

    public static String staticMethod(String username){
        return username;
    }
}
