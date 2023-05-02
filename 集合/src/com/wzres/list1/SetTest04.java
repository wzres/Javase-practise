package com.wzres.list1;

import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName：SetTest04
 * @description：
 * @date：2023-05-02 17:40
 */
public class SetTest04 {

    public static void main(String[] args) {

        Set<User> set = new TreeSet<>();
        set.add(new User("zhangsan",17));
        set.add(new User("zhaoliu",17));
        set.add(new User("wangwu",7));
        set.add(new User("lisi",15));

        for (User user : set) {
            System.out.println(user);
        }
    }
}

class User implements Comparable<User>{
    String username;
    Integer age;

    public User(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User o) {
        if(this.age ==o.age){
            return this.username.compareTo(o.username);
        }else
            return this.age.compareTo(o.age);
    }
}
