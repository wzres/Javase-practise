package com.wzres.ref4;



/**
 * @ClassName RefTest1
 * @description
 * @date 2023-06-03 23:09
 */
public class RefTest1 {
    public static void main(String[] args) {
        Dev<String> d = new Dev<>();
        System.out.println(d.flag("你好，张三"));
        d.setAddress("北京");
        System.out.println(d.getAddress());
        A a = new A();
        System.out.println(a.flag(123));

        Dev<Boolean> d2 = new B<>();
        System.out.println(d2.flag(true));
    }
}

class Dev<T>{
    private T address;

    public T flag(T t){
        return t;
    }

    public T getAddress() {
        return address;
    }

    public void setAddress(T address) {
        this.address = address;
    }
}

class A extends Dev<Integer>{
    @Override
    public Integer flag(Integer integer) {
        return integer;
    }
}

class B<T> extends Dev<T>{
    @Override
    public T flag(T t) {
        return t;
    }
}
