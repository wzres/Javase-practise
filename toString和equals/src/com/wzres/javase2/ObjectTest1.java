package com.wzres.javase2;

import java.util.Objects;

/**
 * @ClassName：ObjectTest1
 * @description：
 * @date：2023-04-26 21:35
 */
public class ObjectTest1 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", "北京昌平", 17);
        Student student2 = new Student("zhangsan", "北京昌平", 17);

        //比较对象内容是否相等，必须重写equals
        boolean equals = student1.equals(student2);
        System.out.println(equals);

        //输出一个引用，会自动调用toString，必须重写toString
        System.out.println(student1);

    }
}

class Student{
    private String username;
    private String address;
    private Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(username, student.username) && Objects.equals(address, student.address) && Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, address, age);
    }

    public Student() {
    }

    public Student(String username, String address, Integer age) {
        this.username = username;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
