package com.wzres.map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName MaoTest06
 * @description
 * @date 2023-05-21 20:52
 */
public class MaoTest06 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "tom");
        map.put(3, "lucy");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> node : entries) {

            System.out.println(node.getKey()+node.getValue()
            );
        }
    }
}
