package com.wzres;

/**
 * @ClassName：Student
 * @description：
 * @date：2023-05-05 09:13
 */
public class Student {
    private String username;
    private Integer age;
    private String address;

    public Student(String username, Integer age, String address) {
        this.username = username;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
