package com.wzres.javase1;

import java.util.Objects;

/**
 * @ClassName：ComputerTest
 * @description：
 * @date：2023-04-16 21:15
 */
public class ComputerTest {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.setBrand("联想");
        computer1.setModel("yp7000");
        computer1.setPrice(8000.15);

        Computer computer2 = new Computer();
        computer2.setBrand("联想");
        computer2.setModel("yp7000");
        computer2.setPrice(8000.15);

        System.out.println(computer1);
        System.out.println(computer1==computer2); //false
        boolean equals = computer1.equals(computer2);
        System.out.println("equals = " + equals); //true
    }
}

class Computer{
    private String brand;
    private String model;
    private Double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(brand, computer.brand) && Objects.equals(model, computer.model) && Objects.equals(price, computer.price);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
