package com.wzres.map2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @ClassName MapTest1
 * @date 2023-06-17 18:21
 */
public class MapTest1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("zhangsan", 75);
        map.put("lisi", 5);
        map.put("zhaoliu", 35);
        map.put("zhang", 15);
        map.put("zhangs", 45);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> node : entries) {
            System.out.println(node.getKey()+"-"+node.getValue());
        }

        System.out.println("----------------");

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("zsan", 75);
        map2.put("lisi", 5);
        map2.put("ahaoliu", 35);
        map2.put("bhang", 15);
        map2.put("zhangs", 45);
        map2.put("dhang1", 44);
        map2.put("dhang2", 44);
        map2.put("zhang2", 46);

        Set<Map.Entry<String, Integer>> entries2 = map2.entrySet();
        for (Map.Entry<String, Integer> node : entries2) {
            System.out.println(node.getKey()+"-"+node.getValue());
        }
    }
}
