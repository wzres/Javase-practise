package com.wzres.multi8;

/**
 * @ClassName MultiTest
 * @date 2023-06-12 15:42
 */
public class MultiTest {
    public static void main(String[] args) {
        //多态：父类型引用指向子类型对象
        //特点
        //1.编译期看父类有没有该方法
        //2.运行期调用的是子类方法

        //向上转型
        Person p = new Student();
        p.dev();

        //向下转型
        //访问子类特有的方法需要向下转型
        if(p instanceof Student){
            Student s = (Student) p;
            s.stuDay();
        }

        //向下转型
        Person p2 = new Teacher();
        if(p2 instanceof Teacher){
            ((Teacher) p2).teach();
        }


    }
}
