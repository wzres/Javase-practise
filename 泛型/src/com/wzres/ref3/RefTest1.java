package com.wzres.ref3;

/**
 * @ClassName RefTest1
 * @description
 * @date 2023-05-28 21:43
 */
public class RefTest1 {
    public static void main(String[] args) {
        Person<String> p = new Person<>();
        System.out.println(p.test("helloword"));

        Person p1 = new Person(123); //实例变量T为int数据类型
        System.out.println(p1.test(true)); //test方法T的数据类型还未确定，所以为object类型

    }

}

class Person<T>{
    T t;

    public T test(T t){
        return t;
    }

    public Person() {
    }

    public Person(T t) {
        this.t = t;
    }
}
