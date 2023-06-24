package com.wzres.interface9;

/**
*
* @ClassName ComputerSystem
* @date 2023-06-19 17:53
*/
public class InterfaceTest1 {
    public static void main(String[] args) {
        windows10 w = new windows10();
        System.out.println(w.test("   zhangsan"));

        ComputerSystem<Integer> c = new Linux<>();
        System.out.println(c.test(97));
    }
}

interface ComputerSystem <T>{
    T test(T t);
}

class windows10 implements ComputerSystem<String>{

    /**
     *
     * @param s
     * @return String
     */
    @Override
    public String test(String s) {
        return s.trim();
    }
}

class Linux<T> implements ComputerSystem<T>{

    @Override
    public T test(T t) {
        return t;
    }
}