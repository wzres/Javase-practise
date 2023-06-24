package com.wzres.set1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName SteTest1
 * @date 2023-06-18 23:53
 */
public class SteTest1 {
    public static void main(String[] args) {

        // 无序不可重复

        // hashset必须重写equals和haseCode方法(IDEA自动生成)
        Set<Student> s = new HashSet<>();


        Student students1 = new Student(1000);
        Student students2 = new Student(1000);
        s.add(students1);
        s.add(students2);

        for (Student student : s) {
            System.out.println(student);
        }

        System.out.println("--------------");

        // TressSet：只需要重写equals方法，不需要重写haseCode方法
        Set<Student> s2 = new TreeSet<>();
        s2.add(new Student(30));
        s2.add(new Student(30));

        for (Student student : s2) {
            System.out.println(student);
        }
    }
}

class Student implements Comparable<Student> {
    Integer id;

    public Student(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return o.id - this.id;
    }
}
