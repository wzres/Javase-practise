package com.wzres.map2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @ClassName MapTest2
 * @date 2023-06-23 18:02
 */
public class MapTest2 {
    public static void main(String[] args) {
        Map<Integer, String> maps = new HashMap<>();
        maps.put(900, "tom");
        maps.put(800, "jack");
        maps.put(700, "mary");
        maps.put(600, "lucy");
        maps.put(700, "puck");

        Set<Map.Entry<Integer, String>> entries = maps.entrySet();
        entries.forEach(node->{
            System.out.println(node.getKey());
            System.out.println(node.getValue());
        });

        System.out.println("--------------");

        Map<Integer, String> maps1 = new TreeMap<>();
        maps1.put(900, "tom");
        maps1.put(800, "jack");
        maps1.put(700, "mary");
        maps1.put(600, "lucy");
        maps1.put(700, "puck");

        maps1.entrySet().forEach(node ->{
            System.out.println(node.getKey());
            System.out.println(node.getValue());
        });


    }
}
