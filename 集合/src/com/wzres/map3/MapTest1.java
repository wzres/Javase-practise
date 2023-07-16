package com.wzres.map3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @ClassName MapTest1
 * @date 2023-07-08 21:50
 */
public class MapTest1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("zhangsan", 110);
        map.put("lisi", 120);
        map.put("wangwu", 380);
        map.put("zhaoliu", 720);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        entries.forEach(node ->{
            System.out.println(node.getKey());
            System.out.println(node.getValue());
        });


        System.out.println("---------------------");

        Map<String, Integer> map1 = new TreeMap<>();
        map1.put("zhangsan", 110);
        map1.put("lisi", 120);
        map1.put("wangwu", 380);
        map1.put("zhaoliu", 720);
        Set<Map.Entry<String, Integer>> entries2 = map1.entrySet();
        entries2.forEach(node ->{
            System.out.println(node.getKey());
            System.out.println(node.getValue());
        });
    }
}
