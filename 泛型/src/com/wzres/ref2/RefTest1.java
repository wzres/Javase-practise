package com.wzres.ref2;

/**
 * @ClassName RefTest1
 * @description
 * @date 2023-05-16 21:18
 */
public class RefTest1 {
    public static void main(String[] args) {
        User u = new User();
        u.data = "456";
        System.out.println(u.test());

        User<Integer> u1 = new User<>();
        u1.data = 789;
        System.out.println(u1.test());

        User u2 = new User(new A());
        A b = (A) u2.test();
        System.out.println(b);
        b.hello();
    }
}

class User<T>{
    T data;

    public User(T data) {
        this.data = data;
    }

    public User() {

    }

    public T test(){
        //data.hello();
        return data;

    }
}


class A{
    public void hello(){
        System.out.println("hello你好");
    }
}