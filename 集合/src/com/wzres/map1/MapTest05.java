package com.wzres.map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName MapTest05
 * @description
 * @date 2023-05-15 21:35
 */
public class MapTest05 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("zhangsan",1);
        map.put("zhangsan1",2);
        map.put("zhangsan2",3);
        map.put("zhangsan3",4);
        map.put("zhangsan4",5);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> node : entries) {
            System.out.println(node.getKey() + ":" + node.getValue());
        }
    }
}
