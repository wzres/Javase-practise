package com.wzres.static3;

/**
 * @ClassName：StaticTest1
 * @description：
 * @date：2023-05-12 22:41
 */
public class StaticTest1 {
    public static void main(String[] args) {
        Person p = new Person(110, "张三");
        System.out.println(Person.nationality);
        System.out.println(p.getId());
        System.out.println(p.getName());
    }
}

class Person{
    static String nationality = "中国";
    private Integer id;
    private String name;

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static String getNationality() {
        return nationality;
    }

    public static void setNationality(String nationality) {
        Person.nationality = nationality;
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
}
