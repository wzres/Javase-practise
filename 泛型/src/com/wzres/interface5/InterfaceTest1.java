package com.wzres.interface5;

/**
 * @ClassName InterfaceTest1
 * @description
 * @date 2023-05-16 21:58
 */
public class InterfaceTest1 {
    public static void main(String[] args) {
        Person<String> p = new Student<>();
        System.out.println(p.test("456"));

   /*     Person p = new Student();
        System.out.println(p.test("456"));*/


        Person t = new Teacher();
        System.out.println(t.test(456));

    }


}

interface Person<T>{
    T test(T t);
}

class Student<T> implements Person<T>{

    @Override
    public T test(T t) {
        return t;
    }
}

class Teacher implements Person<Integer>{

    @Override
    public Integer test(Integer integer) {
        return integer;
    }
}
