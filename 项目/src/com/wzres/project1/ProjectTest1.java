package com.wzres.project1;

/**
 * @ClassName：ProjectTest1
 * @description：
 * @date：2023-05-01 10:22
 */
public class ProjectTest1 {
    public static void main(String[] args) {
        Address a = new Address("北京");
        Person p = new Person("jack",110);
        p.MyCall(a);
    }
}

class Address{
    String address;

    public String call(){
        return address;
    }

    public Address() {
    }

    public Address(String address) {
        this.address = address;
    }
}

class Person{
    String name;
    int phone;
    Address address;



    public void MyCall(Address a){
        System.out.println(name+"的地址："+a.call()+",联系号码："+phone);
    }

    public Person() {
    }

    public Person(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }
}
