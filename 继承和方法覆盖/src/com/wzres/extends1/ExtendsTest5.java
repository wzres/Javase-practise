package com.wzres.extends1;

/**
 * @ClassName：ExtendsTest5
 * @description：
 * @date：2023-04-15 09:02
 */
public class ExtendsTest5 {
    public static void main(String[] args) {
        Book book = new Book();
        book.setNumer(1002L);
        book.setPrice(7.15);
        book.setAddress("北京昌平");
        book.setBrand("美宜佳");
        System.out.println(book);
        System.out.println("商品品牌："+book.getBrand()+",商品住址："+book.getAddress());

    }
}

class Book extends Commodity{
    private Long numer;
    private Double price;

    @Override
    public String toString() {
        return "Book{" +
                "numer=" + numer +
                ", price=" + price +
                '}';
    }

    public Long getNumer() {
        return numer;
    }

    public void setNumer(Long numer) {
        this.numer = numer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

class Commodity{
    private String address;
    private String brand;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

