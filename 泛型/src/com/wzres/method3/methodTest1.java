package com.wzres.method3;



/**
 * @ClassName methodTest1
 * @date 2023-06-17 16:48
 */
public class methodTest1 {
    public static void main(String[] args) {
        Dev d = new Dev();
        System.out.println(d.hello("New Beginings"));
    }

}

class Dev{
    public <T> T hello(T t){
        return t;
    }
}
