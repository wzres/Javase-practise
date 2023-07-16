package com.wzres.extends6;

/**
 * @ClassName ExtendTest1
 * @date 2023-07-09 22:50
 */
public class ExtendTest1 {
    public static void main(String[] args) {
     /*   Clothes c = new Clothes();
        c.setSize("小码");
        c.setColor("红颜色");
        System.out.println(c.getSize()+c.getColor());*/




        Sweater s = new Sweater();
        s.setSize("M");
        s.setColor("红色");
        s.setPrice(56.5);
        System.out.println(s.getColor()+s.getSize()+s.getPrice());

    }
}

class Clothes{
    private String size;
    private String color;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Sweater extends Clothes{
    private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}