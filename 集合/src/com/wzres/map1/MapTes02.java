package com.wzres.map1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName：MapTes02
 * @description：
 * @date：2023-05-01 22:49
 */
public class MapTes02 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "星期一");
        map.put(3, "星期二");
        map.put(2, "星期三");
        map.put(4, "星期四");

        Set<Integer> keys = map.keySet();

        Iterator<Integer> iterator = keys.iterator();
        while (iterator.hasNext()){
            Integer key = iterator.next();
            String s = map.get(key);
            System.out.println(key+s);
        }

        for (Integer key : keys) {
            String s = map.get(key);
            System.out.println(key+"---"+s);
        }


        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        Iterator<Map.Entry<Integer, String>> iterator1 = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> node = iterator1.next();
            System.out.println(node.getKey()+"-"+node.getValue());
        }

        for (Map.Entry<Integer, String> node : entries) {
            System.out.println(node.getKey()+"->>>"+node.getValue());
        }
    }
}
