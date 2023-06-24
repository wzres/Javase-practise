package com.wzres.list7;


import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ListTest1
 * @date 2023-06-19 18:02
 */
public class ListTest1 {
    public static void main(String[] args) {
        List<SonUser> s = new ArrayList<>();
        s.add(new SonUser("zhangsan", "shenzhen"));
        s.add(new SonUser("lisi", "zhangjiagang"));
        primary(s);

    }

    private static void primary(List<? extends User> s) {
      /*  User user1 = s.get(0);
        User user2 = s.get(0);
        SonUser s1 = (SonUser) user1;
        SonUser s2 = (SonUser) user2;
        s1.dev();
        s2.dev();*/

        System.out.println(s.get(0));
        System.out.println(s.get(1));

    }
}


class User{
    String username;
    String address;

    public User() {
    }

    public User(String username, String address) {
        this.username = username;
        this.address = address;
    }

   /* @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }*/
}

class SonUser extends  User{
    public SonUser(String username, String address) {
        super(username, address);
    }

    public void dev(){
        System.out.println(username+","+address);
    }

    @Override
    public String toString() {
        return "SonUser{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}