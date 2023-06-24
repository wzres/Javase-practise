package com.wzres.static1;

/**
 * @ClassName：StaticVar2
 * @description：
 * @date：2023-04-15 07:22
 */
public class StaticVar2 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(17);
        student.setAddress("北京");
        Student.nationality = "中国";
        System.out.println("学生年龄："+student.getAge()+"，学生地址:"+student.getAddress()+",学生国籍："+Student.nationality);

    }
}

class Student{
    public static String nationality;
    private Integer age;
    private String address;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static String getNationality() {
        return nationality;
    }

    public static void setNationality(String nationality) {
        Student.nationality = nationality;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
