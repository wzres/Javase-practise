package com.wzres.ref1;

/**
 * @ClassName：RefTest3
 * @description：
 * @date：2023-05-12 22:03
 */
public class RefTest3 {
    public static void main(String[] args) {
        User<String> s = new User<>();
        System.out.println(s.test("123"));

        s.hello("456");

        System.out.println("---------------");

 /*       User<Integer> s1 = new UserSon<>();
        s1.hello(123);
        System.out.println(s1.test(456));*/

        UserSOn u = new UserSOn();
        System.out.println(u.test('中'));
        u.hello('国');

    }
}


class User<T>{
    public T test(T t){
        return t;
    }

    public void hello(T t){
        System.out.println(t);
    }
}

/*class UserSon<T> extends User<T>{
    @Override
    public T test(T t) {
        return t;
    }

    @Override
    public void hello(T t) {
        System.out.println(t);
    }
}*/

class UserSOn extends User<Character>{
    @Override
    public Character test(Character character) {
        return character;
    }

    @Override
    public void hello(Character character) {
        System.out.println(character);
    }
}
