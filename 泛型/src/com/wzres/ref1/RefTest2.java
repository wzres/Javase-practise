package com.wzres.ref1;

/**
 * @ClassName：RefTest2
 * @description：
 * @date：2023-05-05 21:10
 */
public class RefTest2 {
    public static void main(String[] args) {
        School<Boolean> s = new School<>();
        s.test(true);

        Student s1 = new Student();
        s1.test(24);

        Student<String> s2 = new Student<>();
        s2.test("你好");



    }
}

class School<T> {

    public void test(T t){
        System.out.println(t);
    }

}

/*class Student extends School<Integer>{
    @Override
    public void test(Integer integer) {
        System.out.println(integer);
    }
}*/


class Student<T> extends School<T>{
    @Override
    public void test(T t) {
        super.test(t);
    }
}