package com.wzres.javase3;

import java.util.Objects;

/**
 * @ClassName：Demo1
 * @description：
 * @date：2023-05-04 22:16
 */
public class Demo1 {

    public static void main(String[] args) {
        Student S1 = new Student("zhangsan",17);
        Student S2 = new Student("zhangsan",17);
        System.out.println(S1.equals(S2));
        System.out.println(S1 == S2);
    }

}

class Student{
    private String username;
    private Integer age;

    public Student(String username, Integer age) {
        this.username = username;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(username, student.username) && Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, age);
    }
}
