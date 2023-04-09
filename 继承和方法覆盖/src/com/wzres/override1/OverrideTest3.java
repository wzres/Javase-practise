package com.wzres.override1;

/**
 * @ClassName：OverrideTest3
 * @description：
 * @date：2023-04-10 04:12
 */
public class OverrideTest3 {
    public static void main(String[] args) {
        Rock r = new Rock();
        r.play();
    }
}

class Music{
    public void play(){
        System.out.println("音乐正在播放中...");
    }
}

class Rock extends Music{
    //方法覆盖：当父类的方法无法满足子类的业务需求时，需要重写父类的方法
    @Override
    public void play() {
        System.out.println("摇滚音乐正在播放中...");
    }
}
