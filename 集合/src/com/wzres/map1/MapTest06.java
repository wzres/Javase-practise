package com.wzres.map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @ClassName MapTest06
 * @description
 * @date 2023-06-01 21:47
 */
public class MapTest06 {

    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(87,"zhangsan");
        map.put(67,"zhaoliu");
        map.put(59,"wangwu");
        map.put(32,"tom");
        map.put(43,"jack");
        map.put(43,"lucy");
        map.put(5,"jeff");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> node : entries) {
            System.out.println(node.getKey()+node.getValue());
        }
    }


}
