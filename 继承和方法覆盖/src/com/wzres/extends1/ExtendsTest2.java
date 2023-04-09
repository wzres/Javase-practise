package com.wzres.extends1;

/**
 * @ClassName：ExtendsTest2
 * @description：
 * @date：2023-04-08 19:25
 */
public class ExtendsTest2 {
    public static void main(String[] args) {
        Man man = new Man();
        man.setName("李四");
        man.createMan();
    }
}

//父类
class ManFactory{
    //职位
    private String post = "军人";
    //性别
    private char sex = '男';

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}

//子类
class Man extends ManFactory{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createMan(){
        System.out.println("正在创造人物名字："+name+"，职位："+getPost()+"，性别："+getSex());
    }
}