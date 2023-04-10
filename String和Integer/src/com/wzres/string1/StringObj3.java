package com.wzres.string1;

/**
 * @ClassName：StringObj3
 * @description：toString和构造方法
 * @date：2023-04-11 04:05
 */
public class StringObj3 {
    public static void main(String[] args) {
        String s1 = new String("123");//堆中和字符串常量池创建
        System.out.println("s1 = " + s1); //123 String重写了toString

        String s2 = "456";//最常用，字符串常量池创建
        System.out.println("s2 = " + s2); //456 String重写了toString

        //String s3 = new String(byte数组)
        byte bytes [] = {97,98,99};

        String s3 = new String(bytes);
        System.out.println("s3 = " + s3);
        //String s4 = new String(byte数组,起始下标，长度)
        String s4 = new String(bytes,1,2); //将数组的一部分转换成字符串
        System.out.println("s4 = " + s4); //b,c

        //String s5 = new String(char数组)
        char chars[] = {'我', '是', '中', '国', '人'};
        String s5 = new String(chars);
        System.out.println("s5 = " + s5); //我是中国人
        //String s6 = new String(char数组,起始下标，长度)
        String s6 = new String(chars,2,3); //将数组的一部分转换成字符串
        System.out.println("s6 = " + s6); //中国人
    }
}
