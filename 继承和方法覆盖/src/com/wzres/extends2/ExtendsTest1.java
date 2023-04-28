package com.wzres.extends2;

/**
 * @ClassName：ExtendsTest1
 * @description：
 * @date：2023-04-24 21:39
 */
public class ExtendsTest1 {

    public static void main(String[] args) {
        Student s = new Student();
        s.setUsername("zhangsan");
        s.setAge(17);
        s.setAddress("北京昌平");
        System.out.println("学校地址："+s.getAddress()+"，学生名字："+s.getUsername()+"，学生年龄"+s.getAge());

    }

}

class Student extends School{
    private String username;
    private Integer age;

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

class School{
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
