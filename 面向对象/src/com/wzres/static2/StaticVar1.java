package com.wzres.static2;

/**
 * @ClassName：StaticVar1
 * @description：
 * @date：2023-04-23 20:41
 */
public class StaticVar1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setUsername("zhangsan");
        student.setAge(19);
        System.out.println(Student.nationality);
        System.out.println(student.getAge());
        System.out.println(student.getUsername());
    }
}

class Student{
    public static String nationality="中国";
    private String username;
    private Integer age;

    public static String getNationality() {
        return nationality;
    }

    public static void setNationality(String nationality) {
        Student.nationality = nationality;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}