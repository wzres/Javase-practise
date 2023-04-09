package com.wzres.javase1;

import java.util.Objects;

/**
 * @ClassName：StudentTest
 * @description：
 * @date：2023-04-05 02:58
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setName("张三");
        student.setSex('男');

        Student student1 = new Student();
        student1.setId(1);
        student1.setName("张三");
        student1.setSex('男');

        //等号默认比较两个对象的内存地址，比较对象的内容应该用equals(已经重写了)
        System.out.println(student==student1); //false

        //使用equals
        boolean equals = student.equals(student1);
        System.out.println(equals); //true

        //输出一个应用默认会调用toString，我们重写了toString方法
        System.out.println(student);

    }
}

class Student{
    private Integer id;
    private String name;
    private Character sex;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(sex, student.sex);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }
}
