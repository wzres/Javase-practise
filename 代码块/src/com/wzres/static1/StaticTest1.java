package com.wzres.static1;

public class StaticTest1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setNum(01);
        student.setName("zhangsan");
        Student student1 = new Student();
        student1.setNum(02);
        student1.setName("lisi");

        //但这样就报错了
        //com.wzres.static1.Student.SchName;
        //这样就不报错
        System.out.println(Student.schName);
        System.out.println(student.getNum());
        System.out.println(student.getName());
        System.out.println(student1.getNum());
        System.out.println(student1.getName());



    }
}

class Student {
    public static String schName = "尚硅谷";
    private  Integer num;
    private String name;

    static{
        System.out.println("静态代码块，类加载时执行"+schName);
    }

    public static String getSchName() {
        return schName;
    }

    public static void setSchName(String schName) {
        schName = schName;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}