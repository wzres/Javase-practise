package com.wzres.ref7;


/**
 * @ClassName RefTest1
 * @date 2023-06-27 23:57
 */
public class RefTest1 {
    public static void main(String[] args) {
        Beverage<Cola> beverage = new Beverage<>();
        beverage.primary(new Cola());

        Beverage<Juice> beverage1 = new Beverage<>();
        beverage1.primary(new Juice());

        Juice juice = new Juice();
        juice.primary(new Cola());
    }




}

class Beverage<T>{
    private T data;

    public void primary(T t){
        System.out.println(t);
    }
}

class Cola{

}


class Juice extends Beverage<Cola>{
    @Override
    public void primary(Cola cola) {
        System.out.println(cola);
    }
}