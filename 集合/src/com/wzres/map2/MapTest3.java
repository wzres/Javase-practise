package com.wzres.map2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @ClassName MapTest3
 * @date 2023-07-08 21:42
 */

public class MapTest3 {
    public static void main(String[] args) {
        // hashset的元素和放在hashMap的key部分的元素必须重写equals和hashcode方法;
        Map<User, String> map = new HashMap<>();
        map.put(new User("zhangsan", 19), "110");
        map.put(new User("zhangsan", 19), "110");

        map.entrySet().forEach(user-> System.out.println(user));

    }
}

class User{
    String username;
    Integer age;

    public User(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(age, user.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
