package com.wzres.list3;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ListTest1
 * @description
 * @date 2023-05-16 21:48
 */
public class ListTest1 {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        User u = new User("zhangsan","北京");
        list.add(u);

        UserSon u2 = new UserSon("tom", "成都");
        list.add(u2);
        test(list);

        List<UserSon> list1 = new ArrayList<>();
        list1.add(new UserSon("lisi", "南京"));
        test(list1);
    }

    public static void test(List<? extends User> list) {
        //System.out.println(list.get(0));
        for (User user : list) {
            System.out.println(user);
        }
    }
}

class User{
    String username;
    String address;

    public User(String username, String address) {
        this.username = username;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

class UserSon extends User{

    public UserSon(String username, String address) {
        super(username, address);
    }

    @Override
    public String toString() {
        return "UserSon{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
