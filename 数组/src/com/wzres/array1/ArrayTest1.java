package com.wzres.array1;

/**
 * @ClassName：arrays
 * @description：
 * @date：2023-04-02 01:16
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        //静态化初始化数组
        /*int [] arr = {97,98,99};
        System.out.println(Arrays.toString(arr));

        //遍历数组一
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("--------------------------");

        //遍历数组二
        for (int i : arr) {
            System.out.println(i);
        }
    }*/

        School [] schools = {
            new School(110,"tom"),
            new School(120,"jack")
        };

        //遍历一
        for (int i = 0; i < schools.length; i++) {
            //System.out.println(schools[i]);
            schools[i].studay();
        }
        //遍历二
        for (School school : schools) {
            System.out.println(school);
        }
    }


}


class School{
    private int id;
    private String name;

    public void studay(){
        System.out.println(name+"在学习");
    }

    public School() {
    }

    public School(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
