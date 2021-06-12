package com.sda.javaadvenceexercises.vendingmachine;

public class Product {

    private double price;
    private String name;
    private String code;

    public Product(double price, String name, String code){
        this.price = price;
        this.name = name;
        this.code = code;

    }


    public double getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }

    public String getCode(){
        return this.code;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", code=" + code +
                '}';
    }
}
