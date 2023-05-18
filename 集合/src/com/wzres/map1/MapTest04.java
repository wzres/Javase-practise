package com.wzres.map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName：MapTest04
 * @description：
 * @date：2023-05-09 21:47
 */
public class MapTest04 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "wangwu");
        map.put(4, "liming");

        System.out.println(map);

        Set<Integer> set = map.keySet();
        for (Integer integer : set) {
            System.out.println(integer+map.get(integer));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> node : entries) {
            System.out.println(node.getKey() + node.getValue());
        }

    }
}
