package com.wzres.list2;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName：ListTest1
 * @description：
 * @date：2023-05-12 22:22
 */
public class ListTest1 {
    public static void main(String[] args) {
        List<A> list = new ArrayList<>();
        list.add(new A());
        list.add(new A());
        list.add(new B());

        m1(list);

        List<A> list1 = new ArrayList<>();
        list1.add(new A());


        list1.add(new B());

        m2(list1);

        List<A> list3 = new ArrayList<>();
        list3.add(new B());
        m2(list3);



    }

    public static void m1(List<A> a){
        System.out.println(a);
    }

    public static void m2(List<? extends A> a){
        A a1 = a.get(0);
        a1.test();
    }
}

class T{
    public void test(){

    }
}

class A extends T{
    public void test(){
        System.out.println("A的test方法执行了");
    }
}

class B extends A{
    @Override
    public void test() {
        System.out.println("B的test方法执行了");
    }
}
