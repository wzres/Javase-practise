package com.wzres.list5;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName LIstTest1
 * @description
 * @date 2023-06-03 23:19
 */
public class ListTest1 {
    public static void main(String[] args) {
        List<User2> l = new ArrayList<>();
        l.add(new User2(18));
        l.add(new User2(30));
        dev(l);
    }

    private static void dev(List<? extends User1> list) {
        for (User1 num : list) {
            System.out.println(num);
        }
    }

}

class User1{
    int age;

    public User1() {
    }

    public User1(int age) {
        this.age = age;
    }
}

class User2 extends User1{
    public User2() {

    }

    public User2(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return "User2{" +
                "age=" + age +
                '}';
    }
}
