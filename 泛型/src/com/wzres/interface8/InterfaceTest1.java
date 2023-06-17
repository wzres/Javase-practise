package com.wzres.interface8;

/**
 * @ClassName InterfaceTest1
 * @date 2023-06-17 16:43
 */
public class InterfaceTest1 {
    public static void main(String[] args) {
        PhoneSystem<String> p = new Android<>();
        System.out.println(p.test("华为")+"正在重装系统");

        Apple a = new Apple();
        System.out.println(a.test(546)+"正在重装系统");
    }
}

interface PhoneSystem<T>{
    T test(T t);

}

class Android<T> implements PhoneSystem<T>{

    @Override
    public T test(T t) {
        return t;
    }
}

class Apple implements PhoneSystem<Integer>{

    @Override
    public Integer test(Integer integer) {
        return integer;
    }
}
