package com.wzres.ref8;

/**
 * @ClassName RefTest1
 * @date 2023-07-01 21:13
 */
public class RefTest1 {
    public static void main(String[] args) {
       /* Beverage<String> beverage = new Beverage<>();
        beverage.drink("123");
        Cola cola = new Cola();
        cola.drink(789);

        Juice<Integer> juice = new Juice<>();
        juice.drink(569);*/

        Beverage<String> beverage1 = new Juice<>();
        beverage1.drink("456");
        beverage1.setData("253");
        System.out.println(beverage1.getData());


    }


}

class Beverage<T>{
    private T data;

    public void drink(T t) {
        System.out.println(t);
        System.out.println(data);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

class Cola extends Beverage<Integer>{
    @Override
    public void drink(Integer integer) {
        System.out.println(integer);
    }
}


class Juice<T> extends Beverage<T>{

    @Override
    public void drink(T t) {
        System.out.println(t);
    }
}