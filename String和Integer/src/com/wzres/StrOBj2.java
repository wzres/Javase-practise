package com.wzres;

/**
 * @ClassName：StrOBj2
 * @description：
 * @date：2023-04-06 07:45
 */
public class StrOBj2 {
    public static void main(String[] args) {
         byte many [] = {97,98,99};
         String strOBj = new String(many);
        System.out.println(strOBj);

        char chas [] = {97,98,99};
        String strObj = new String(chas);
        System.out.println(strOBj);

        // 这种方法创建比较常用，推荐
        String s1 = "123";
        String s2 = "123";
    }
}
