package com.wzres.extends1;

/**
 * @ClassName：ExtendsTest3
 * @description：
 * @date：2023-04-08 19:50
 */
public class ExtendsTest3 {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.name = "荀彧";
        hero.skill();
    }
}

class Heros{

    String name;

    public void skill(){
        System.out.println("英雄技能是");
    }
}

class Hero extends Heros{

}