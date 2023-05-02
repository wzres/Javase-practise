package com.wzres.list1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName：ListTest01
 * @description：
 * @date：2023-04-22 16:35
 */
public class ListTest01 {
    public static void main(String[] args) {
        // 有序可重复
        List mylist = new ArrayList();
        mylist.add(1);
        mylist.add(4);
        mylist.add(2);
        mylist.add(3);
        mylist.add(3);
        mylist.add(5);
        mylist.add(6);
        mylist.add(7);
        mylist.add(8);

        // 遍历一
        Iterator it = mylist.iterator();
        while (it.hasNext()){
            Object element = it.next();
            System.out.println(element);
        }


        //遍历二
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }

    }
}
