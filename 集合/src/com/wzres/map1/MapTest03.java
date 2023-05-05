package com.wzres.map1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName：MapTest03
 * @description：
 * @date：2023-05-03 12:26
 */
public class MapTest03 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("zhangsan", 17);
        map.put("lisi", 2);
        map.put("wangwu", 7);
        map.put("zhaoliu", 6);
        map.put("jack", 5);

        Set<String> strings = map.keySet();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key+"--"+value);
        }

        for (String key : strings) {
            System.out.println(key + map.get(key));
        }

        System.out.println("---------------------");

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = entries.iterator();
        while (it.hasNext()){
            Map.Entry<String, Integer> node = it.next();
            System.out.println(node.getKey()+"->"+node.getValue());
        }

        for (Map.Entry<String, Integer> node : entries) {
            System.out.println(node.getKey()+"->>"+node.getValue());
        }
    }
}

