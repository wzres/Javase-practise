package com.wzres.multi2;

/**
 * @ClassName：MultiAnimal
 * @description：
 * @date：2023-03-30 00:53
 */
public class MultiTest1 {
 public static void main(String[] args) {
    //向上转型
    Animal animal = new Cat();
    animal.move();

    //向下转型
    //需要访问子类特有的方法时，需要使用向下转型
   Animal animal12 = new Dog();
      if(animal12 instanceof Cat){
       Cat cat = (Cat) animal12;
       cat.clutcMouse();
      }

   /*Animal animal13 = new Dog();
   Cat cat1 = (Cat)animal13;
    cat1.clutcMouse();*/
  }
}

class Animal{
  public void move(){
   System.out.println("动物在移动");

  }
}

class Cat extends Animal{
  @Override
  public void move() {
   System.out.println("猫在走猫步");
  }

  public void clutcMouse(){
   System.out.println("猫在抓老鼠");
  }
}

class Dog extends Animal{
  @Override
  public void move() {
   System.out.println("狗在嚎叫");
  }
}
