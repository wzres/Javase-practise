package multi3;

/**
 * @ClassName：Animal
 * @description：多态的使用
 * @date：2023-04-02 00:50
 */

public class MultiTest1 {
    public static void main(String[] args) {
        // 向上转型

        Animal a = new Cat();
        a.move();

        //向下转型

        Animal a1 = new Bird();
        //什么时候用到向下转型，当访问子类特有的方法时
        if(a1 instanceof Bird){
            Bird b = (Bird) a1;
            b.sing();
        }



    }
}


class Animal {
    public void move(){
        System.out.println("动物在移动");
    }
}

class Cat extends Animal{
    //当父类的方法无法满足子类的方法时，需要重写父类的方法
    @Override
    public void move() {
        System.out.println("猫在走猫步");
    }
}

class Bird extends Animal{
    @Override
    public void move() {
        super.move();
    }

    public void sing(){
        System.out.println("鸟儿在歌唱");
    }
}
