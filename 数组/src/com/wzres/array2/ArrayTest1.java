package com.wzres.array2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName：ArrayTest1
 * @description：
 * @date：2023-04-27 22:17
 */
public class ArrayTest1 {
    public static void main(String[] args) {

        int [] arr = {9,3,81,5,7,15};

        Arrays.sort(arr);
        //System.out.println(Arrays.binarySearch(arr, 81));

        for (int i : arr) {
            System.out.println(i);
        }




        String[] str = new String[5];
        str[0] = "123";
        str[1] = "1234";
        str[2] = "1235";
        str[3] = "12356";
        str[4] = "123567";

        List hello = hello(Arrays.asList(str));

        Iterator iterator = hello.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next+"---");
        }

        for (String s : str) {
            System.out.println(s);
        }

        System.out.println(Arrays.toString(test(str)));


    }

    public static String [] test(String [] s){
        return s;
    }

    public static List hello(List list){
        return list;
    }


}
