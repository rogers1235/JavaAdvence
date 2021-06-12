package com.sda.javafundamentalscoding.vendingmachine;

public class Product {
    private int price;
    private String name;
    private int code;

    public Product(int price, String name, int code) {
        this.price = price;
        this.name = name;
        this.code = code;
    }

    public int getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    // we need to override this method in order to see in console
    // a more readable version of the object using the variables values
    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", code=" + code +
                '}';
    }
}


