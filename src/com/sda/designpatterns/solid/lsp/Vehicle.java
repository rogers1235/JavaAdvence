package com.sda.designpatterns.solid.lsp;

public class Vehicle {

    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
