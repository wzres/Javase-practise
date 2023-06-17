package com.wzres.ref5;



/**
 * @ClassName RefTest1
 * @date 2023-06-17 16:29
 */
public class RefTest1 {
    public static void main(String[] args) {
        user<String> user = new user<>();
        user.hello("你好");
        user.usernam = "zhangsan";
        System.out.println(user.usernam);

        user<Integer> user1 = new A<>();
        //user1.hello(456);
        user1.hello(567);

        B b = new B();
        b.hello(true);
    }
}

class user<T>{
    T usernam;

    public void hello(T t){
        System.out.println(t);
    }

}

class A<T> extends user<T>{
    @Override
    public void hello(T t) {
        System.out.println(t);
    }
}

class B extends user<Boolean>{
    @Override
    public void hello(Boolean aBoolean) {
        System.out.println(aBoolean);
    }
}