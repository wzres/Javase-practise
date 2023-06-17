package com.wzres.extends5;

/**
 * @ClassName ExtendsTest1
 * @description
 * @date 2023-06-07 11:50
 */
public class ExtendsTest1 {
    public static void main(String[] args) {
        /*Student s = new Student("山东", "小李");
        System.out.println(s.getAddress() + s.getName());*/

        Student s = new Student();
        s.setAddress("南京");
        s.setName("王双");

        System.out.println(s.getName()+s.getAddress());

    }
}

class School{
    private String address;

    public School() {
    }

    public School(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Student extends School{
    private String name;

    //public Student(String address, String name) {
    //    super(address);
    //    this.name = name;
    //}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
