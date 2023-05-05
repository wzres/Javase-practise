package com.wzres.List1;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName：ListTest2
 * @description：
 * @date：2023-05-05 21:40
 */
public class ListTest2 {
    public static void main(String[] args) {
        List<A1> list1 = new ArrayList<>();
        list1.add(new A1());
        list1.add(new A1());
        list1.add(new A1());
        list1.add(new A1());
        list1.add(new A2());

        List<A2> list2 = new ArrayList<>();
        list2.add(new A2());

        A3 a3 = new A3();
        a3.age = 15;
        a3.name = "zhangsan";

        list2.add(a3);

        test(list2);

    }

    public static void test(List<? extends A1> list){
        for (A1 a1 : list) {
            System.out.println(a1);
        }
    }

}

class A1{

}

class A2 extends A1{

}
class A3 extends A2{
    int age;
    String name;

    @Override
    public String toString() {
        return "A3{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
