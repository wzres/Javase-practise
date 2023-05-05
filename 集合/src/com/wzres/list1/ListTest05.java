package com.wzres.list1;

import com.wzres.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName：ListTest05
 * @description：
 * @date：2023-05-05 09:15
 */
public class ListTest05 {
    public static void main(String[] args) {
        List<Student> s = new ArrayList<>();
        s.add(new Student("zhangsan", 17, "北京"));
        s.add(new Student("wangwu", 18, "北京"));
        s.add(new Student("lisi", 19, "北京"));
        s.add(new Student("zhaoliu", 20, "北京"));
        s.add(new Student("tom", 22, "北京"));

        for (Student student : s) {
            System.out.println(student);
        }
    }



}
