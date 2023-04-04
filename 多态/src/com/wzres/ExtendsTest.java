package com.wzres;

/**
 * @ClassName：School
 * @description：继承父类的属性
 * @date：2023-03-29 07:58
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        student.setAge(17);
        student.setId(110);
        System.out.println(student.getId()+","+student.getAge()+","+student.getName());

    }
}
class School {
    private int id;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


class Student extends School{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

