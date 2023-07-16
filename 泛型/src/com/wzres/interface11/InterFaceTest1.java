package com.wzres.interface11;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName InterFaceTest1
 * @date 2023-06-28 01:24
 */
public class InterFaceTest1 {

    public static void main(String[] args) {
        ArrayList<Cola> list = new ArrayList<>();
        list.add(new Cola());

        test(list);
    }

    private static void test(List<? extends Beverage> list) {
        System.out.println(list.get(0));
    }
}

class Beverage{

}

class Cola extends Beverage{

}
