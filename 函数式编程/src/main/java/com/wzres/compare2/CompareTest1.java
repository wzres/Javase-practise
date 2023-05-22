package com.wzres.compare2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName CompareTest1
 * @description
 * @date 2023-05-22 20:38
 */
public class CompareTest1 {
    public static void main(String[] args) {
        Inner i1 = new Inner(95);
        Inner i2 = new Inner(17);
        Inner i3 = new Inner(36);
        Inner i4 = new Inner(4);

        Set<Inner> s = new TreeSet<>((o1, o2) -> o1.age- o2.age);

        s.add(i1);
        s.add(i2);
        s.add(i3);
        s.add(i4);

        for (Inner element : s) {
            System.out.println(element);
        }
    }
}

/*class Inner implements Comparable<Inner>{
    Integer age;

    public Inner(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Inner{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Inner o) {
        return this.age.compareTo(o.age);
    }
}*/

class Inner {
    Integer age;

    public Inner(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Inner{" +
                "age=" + age +
                '}';
    }
}
