package com.wzres.static1;

/**
 * @ClassName：StaticObj
 * @description：
 * @date：2023-04-06 07:45
 */
public class StaticVar1 {
    private static int num1;
    private static int num2;

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

        num1 = 12;
        num2 = 12;

        System.out.println(transfer(num1, num2));
        System.out.println(test());

        StaticVar1 strOBj2 = new StaticVar1();
        strOBj2.example();

    }

    public static int  transfer(int a,int b){
            return a + b; //24;
    }

    public static int test(){
        return num1-num2;
    }

    public void example(){
        System.out.println(num1+num2); //24
    }
}
