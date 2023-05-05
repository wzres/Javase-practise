package com.wzres.array2;

import com.wzres.Student;

/**
 * @ClassName：ArrayTest2
 * @description：
 * @date：2023-05-05 20:52
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",17);
        Student student2 = new Student("lisi",18);
        Student student3 = new Student("wangwu",19);
        Student[] arr1 = {student1, student2, student3};
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println(arr1[i].stuDay());
        }

        Student [] arr2 = new Student[3];
        for (int i = 0; i <arr2.length ; i++) {
            try {
                System.out.println(arr2[i].stuDay());
            } catch (Exception e) {
                System.out.println("空指针异常。。。");
                e.printStackTrace();
            }
        }
    }
}
