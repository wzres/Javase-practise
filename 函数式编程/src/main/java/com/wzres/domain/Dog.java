package com.wzres.domain;

/**
 * @ClassName Dog
 * @description
 * @date 2023-06-03 23:36
 */
public class Dog {
    // 访问控制权限修饰符
    public int age;

    public Dog(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }
}
