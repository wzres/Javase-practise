package com.wzres.multi1;

import java.util.Date;

/**
 * @ClassName：MultiTest
 * @description：
 * @date：2023-04-04 09:12
 */
public class MultiTest3 {
    public static void main(String[] args) {
        //向上转型
        School s = new Student();
        s.birth = new Date();
        s.setName("zhangsan");
        s.hobby();
        //向下转型
        //访问子类特有的方法必须向下转型
        if(s instanceof Student){
            Student stu = (Student)s;
            stu.birth();
        }

    }
}

class Student extends School{
    @Override
    public void hobby() {
        System.out.println(getName()+"在学习"); //这里不能直接name，因为私有属性不能继承，私有属性只能在本类中使用
    }
    public void birth(){
        System.out.println(getName()+"的生日："+birth);//这里birth可以直接拿来用，因为不是私有
    }
}

class School{
    Date birth;
    private Integer id;
    private String name;
    private Character sex;

    public void hobby(){

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
