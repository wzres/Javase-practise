package com.wzres.ref1;

/**
 * @ClassName RefTest4
 * @description
 * @date 2023-05-15 22:50
 */
public class RefTest4{
    public static void main(String[] args) {
        //也可以在创建对象传参数来确定A中data的数据类型
        A a = new A("123");
        a.test();
    }

}


class A<T>{
    T data;

    public A(T data) {
        this.data = data;
    }

    public void test(){
        System.out.println(data);
    }
}
