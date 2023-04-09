package com.wzres.javase1;

import java.util.Objects;

/**
 * @ClassName：UserTest
 * @description：
 * @date：2023-04-10 04:43
 */
public class UserTest {

    public static void main(String[] args) {
        User user1 = new User();
        user1.setUsername("zhangsan");
        user1.setPassword("123456");
        System.out.println("user1 = " + user1);

        User user2 = new User();
        user2.setUsername("zhangsan");
        user2.setPassword("123456");
        System.out.println(user1==user2); //false
        //比较两个对象内容是否相等不能用==号，应该用equals，equals方法我重写了
        System.out.println(user1.equals(user2)); //true


    }

}

class User{
    private String username;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(password, user.password);
    }

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

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