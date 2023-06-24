package com.wzres.set1;

import java.util.*;

/**
 * @ClassName SteTest2
 * @date 2023-06-23 17:35
 */
public class SteTest2 {
    public static void main(String[] args) {
        /*//无序不可重复
        Set<Integer> s = new HashSet<>();

        s.add(9);
        s.add(95);
        s.add(92);
        s.add(49);
        s.add(39);
        s.add(39);
        s.add(29);

        s.forEach(age -> System.out.println(age));

        System.out.println("-------------");
        //无序不可重复，但会按照大小自动排序
        Set<Integer> s1 = new TreeSet<>();
        s1.add(9);
        s1.add(95);
        s1.add(92);
        s1.add(49);
        s1.add(39);
        s1.add(39);
        s1.add(29);

        s1.forEach(num -> System.out.println(num));*/


        // 放在hashmap的key部分和放在hast集合的元素必须重写equals和hashcode方法

        /*Set<Product> products = new HashSet<>();
        products.add(new Product("华为", "荣耀", 1500));
        products.add(new Product("华为", "荣耀", 1500));

        products.forEach(product -> System.out.println(product));*/

        Map<Product, String> maps = new HashMap<>();
        maps.put(new Product("华为", "荣耀", 1500), "110");
        maps.put(new Product("华为", "荣耀", 1500), "110");
        maps.put(new Product("华为", "荣耀", 1500), "110");

        Set<Map.Entry<Product, String>> entries = maps.entrySet();
        entries.forEach(node -> {
            System.out.println(node.getKey());
            System.out.println(node.getValue());
        });


    }
}

class Product{
    String brand;
    String moder;
    Integer price;

    public Product(String brand, String moder, Integer price) {
        this.brand = brand;
        this.moder = moder;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "moder='" + moder + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("123");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(moder, product.moder) && Objects.equals(brand, product.brand) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moder, brand, price);
    }
}
