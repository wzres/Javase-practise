package com.wzres.list1;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName：ListTest1
 * @description：泛型上限
 * @date：2023-04-26 22:06
 */
public class ListTest1 {

    public static void main(String[] args) {
        A a = new A();
        List<String> list = new ArrayList<>();
        list.add("123");
        a.test(list);

        List<B> b = new ArrayList<>();
        b.add(new B());
        b.add(new C());
        test1(b);

        List<C> c = new ArrayList<>();
        c.add(new C());
        test2(c);


    }

    public static void test1(List<B> list){
        B b = list.get(0);
        b.hello();
    }

    public static void test2(List<? extends B> list){
        B b = list.get(0);
        b.hello();
    }
}

class A{
    public void test(List<String> list){
        System.out.println(list.get(0));
    }
}

class B{
    public void hello(){
        System.out.println("b...");
    }
}

class C extends B{
    @Override
    public void hello() {
        System.out.println("c...");
    }
}
