package com.wzres;

/**
 * @ClassName：Student
 * @description：
 * @date：2023-05-05 20:51
 */
public class Student {
    private String name;
    private Integer age;

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String stuDay(){
        return name+"在学习...";
    }
}
