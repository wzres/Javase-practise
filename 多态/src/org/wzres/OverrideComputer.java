package org.wzres;

/**
 * @ClassName：OverridePerson
 * @description：
 * @date：2023-03-31 00:20
 */
public class OverrideComputer {
    public static void main(String[] args) {
        //多态➟向上转型
        Computer c = new lenovo();
        c.brand();
        //多态➟向下转型
        //什么时候用到向下转型
        //访问子类特有的方法

        //为什么这里不能用else
        if(c instanceof Asus){
          Asus a = (Asus) c;
          a.moder();
        }else if(c instanceof lenovo){
           lenovo l =  (lenovo)c;
        }

    }
}

class Computer {
    public void brand(){
        System.out.println("电脑的品牌是...");
    }
}

class Asus extends Computer{
    //什么时候用到方法覆盖
    //当父类无法满足子类的业务需求时，子类有必要将父类中继承过来的方法重写
    @Override
    public void brand() {
        System.out.println("电脑的品牌是华硕");
    }

    public void moder(){
        System.out.println("型号是:rtx3060");
    }
}

class lenovo extends Computer{
    public void moder(){
        System.out.println("型号是:rtx151");
    }
}