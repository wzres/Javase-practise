package com.wzres.map1;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @ClassName MapTest07
 * @description
 * @date 2023-06-07 17:16
 */
public class MapTest07 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(45, "zhangsan1");
        map.put(59, "zhangsan2");
        map.put(29, "zhangsan3");
        map.put(39, "zhangsan4");
        map.put(39, "zhangsan5");
        map.put(7, "zhangsan6");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> node : entries) {
            System.out.println(node.getKey() + node.getValue());
        }
    }
}
