package com.wzres.method3;

/**
 * @ClassName MethodTest1
 * @description
 * @date 2023-06-05 17:14
 */
public class MethodTest1 {
    public static void main(String[] args) {
        Person p = new Person("zhangsan",18);
        System.out.println(Person.NATIONALITY);
        System.out.println(p.username);
        System.out.println(p.age);
        System.out.println(p.dev());
    }
}

class Person{
    static String NATIONALITY = "中国";
    String username;
    Integer age;

    public Person(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public static String flag(){
        return NATIONALITY;
    }

    public String dev(){
        return flag();
    }


}
