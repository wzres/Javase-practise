package com.wzres.list9;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ListTest1
 * @date 2023-07-13 15:27
 */
public class ListTest1 {
    public static void main(String[] args) {
        ArrayList<Coat> list = new ArrayList<>();
        list.add(new Coat());
        test(list);
    }

    private static void test(List<? extends Clothes> list) {
        System.out.println(list.get(0));
    }
}

class Clothes{

}

class Coat extends Clothes{

}
