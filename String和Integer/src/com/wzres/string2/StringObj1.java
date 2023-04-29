package com.wzres.string2;

/**
 * @ClassName：StringObj1
 * @description：
 * @date：2023-04-28 21:43
 */
public class StringObj1 {
    public static void main(String[] args) {

        //String重写了equals和toString

        String x = "中国人";
        String y = "中国人";
        System.out.println(x==y); //true

        String s1 = new String("中国人");
        String s2 = new String("中国人");
        System.out.println(s1 == s2); //false
        System.out.println(s1);
        System.out.println(s1.equals(s2)); //true

        byte [] bytes = {97,98,99};

        String a = new String(bytes);
        System.out.println(a);

        String b = new String(bytes,1,2);
        System.out.println(b); //bc



    }
}
